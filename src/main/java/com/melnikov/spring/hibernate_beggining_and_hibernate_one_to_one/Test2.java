package com.melnikov.spring.hibernate_beggining_and_hibernate_one_to_one;

import com.melnikov.spring.hibernate_beggining_and_hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Added new entity Detail. No longer will work.
 */
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
