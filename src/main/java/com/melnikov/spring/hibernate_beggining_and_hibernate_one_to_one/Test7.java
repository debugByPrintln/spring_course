package com.melnikov.spring.hibernate_beggining_and_hibernate_one_to_one;

import com.melnikov.spring.hibernate_beggining_and_hibernate_one_to_one.entity.Detail;
import com.melnikov.spring.hibernate_beggining_and_hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Started one-to-many relations learning. No longer will work.
 */
public class Test7 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = null;

        try {
            session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            Detail detail = session.get(Detail.class, 6);

            detail.getEmployee().setEmpDetail(null);
            detail.setEmployee(null);

            session.delete(detail);

            session.getTransaction().commit();
        }

        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
