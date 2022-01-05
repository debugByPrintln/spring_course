package com.melnikov.spring.hibernate_one_to_many_bi_direct;

import com.melnikov.spring.hibernate_one_to_many_bi_direct.entity.Department;
import com.melnikov.spring.hibernate_one_to_many_bi_direct.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Department.class)
                .addAnnotatedClass(Employee.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = null;

        try {
            session = sessionFactory.getCurrentSession();

            Department department = new Department("IT", 350, 1900);

            Employee employee1 = new Employee("Timur", "Bekmambetov", 600);
            Employee employee2 = new Employee("Sasha", "Petrov", 800);

            department.addEmployeeToDepartment(employee1);
            department.addEmployeeToDepartment(employee2);

            session.beginTransaction();

            session.save(department);

            session.getTransaction().commit();
        }

        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
