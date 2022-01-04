package com.melnikov.spring.hibernate;

import com.melnikov.spring.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{
            Session session = sessionFactory.getCurrentSession();

            Employee emp = new Employee("Alex", "Sergeev", "Madrid", 1001);

            session.beginTransaction();
            session.save(emp);

            Employee employee = session.get(Employee.class, emp.getId());
            session.getTransaction().rollback();

            System.out.println(employee);
        }
        finally {
            sessionFactory.close();
        }
    }
}
