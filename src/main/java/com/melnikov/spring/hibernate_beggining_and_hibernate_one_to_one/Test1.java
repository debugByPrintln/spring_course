package com.melnikov.spring.hibernate_beggining_and_hibernate_one_to_one;

import com.melnikov.spring.hibernate_beggining_and_hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Added new entity Detail. No longer will work.
 */
public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();

            Employee employee = new Employee("Oleg", "Siska", "Tokyo", 2250);

            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        }
        finally {
            sessionFactory.close();
        }
    }
}
