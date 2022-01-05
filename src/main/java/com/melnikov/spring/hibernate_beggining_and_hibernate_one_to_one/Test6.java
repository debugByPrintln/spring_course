package com.melnikov.spring.hibernate_beggining_and_hibernate_one_to_one;

import com.melnikov.spring.hibernate_beggining_and_hibernate_one_to_one.entity.Detail;
import com.melnikov.spring.hibernate_beggining_and_hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Started one-to-many relations learning. No longer will work.
 */
public class Test6 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = null;

        try {
            session = sessionFactory.getCurrentSession();
            //Saving employee + detail on cascade to my_db
            Employee employee = new Employee("Serega", "Siska", "IT", 3000);
            Detail detail = new Detail("Sydney", "88007777777", "siskotryas@mail.ru");
            employee.setEmpDetail(detail);

            session.beginTransaction();




            session.save(employee);

            session.getTransaction().commit();
        }

        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
