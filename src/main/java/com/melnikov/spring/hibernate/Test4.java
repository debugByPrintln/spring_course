package com.melnikov.spring.hibernate;

import com.melnikov.spring.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Employee.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("update Employee set salary = 3000 where name = 'Anton'").executeUpdate();

            session.getTransaction().commit();
        }
        finally {
            sessionFactory.close();
        }
    }
}
