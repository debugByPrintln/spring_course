package com.melnikov.spring.hibernate;

import com.melnikov.spring.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Employee.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            session.createQuery("delete Employee where name = 'Anton'").executeUpdate();

            session.getTransaction().commit();
        }

        finally {
            sessionFactory.close();
        }
    }
}
