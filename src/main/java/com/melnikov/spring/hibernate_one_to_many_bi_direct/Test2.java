package com.melnikov.spring.hibernate_one_to_many_bi_direct;

import com.melnikov.spring.hibernate_one_to_many_bi_direct.entity.Department;
import com.melnikov.spring.hibernate_one_to_many_bi_direct.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
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

            Employee employee = session.get(Employee.class, 1);

            employee.getDepartment().getEmployees().remove(employee);
            employee.setDepartment(null);

            session.delete(employee);

            session.getTransaction().commit();
        }

        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
