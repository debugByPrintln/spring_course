package com.melnikov.spring.hibernate_one_to_many_bi_direct;

import com.melnikov.spring.hibernate_one_to_many_bi_direct.entity.Department;
import com.melnikov.spring.hibernate_one_to_many_bi_direct.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Department.class)
                .addAnnotatedClass(Employee.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = null;

        try {
            session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            Department department = session.get(Department.class, 4);

            System.out.println(department);
            System.out.println(department.getEmployees());

            session.getTransaction().commit();
        }

        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
