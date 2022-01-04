package com.melnikov.spring.hibernate;

import com.melnikov.spring.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Employee myEmp;

        try{
            Session session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            List<Employee> list = session.createQuery("from Employee where id <= 10")
                    .getResultList();

            List<Employee> collect = list.stream()
                    .filter((v) -> v.getId() == 1)
                    .collect(Collectors.toList());

            myEmp = collect.get(0);

            session.getTransaction().commit();
        }

        finally {
            sessionFactory.close();
        }

        System.out.println(myEmp);
    }
}
