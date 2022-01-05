package com.melnikov.spring.hibernate_one_to_many_uni_direct;

import com.melnikov.spring.hibernate_one_to_many_uni_direct.entity.Department;
import com.melnikov.spring.hibernate_one_to_many_uni_direct.entity.Employee;
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

            session.beginTransaction();

//            Department it = new Department("IT", 1000, 100000);
//            Employee employee = new Employee("SS", "BB", 300);
//
//            it.addEmployeeToDepartment(employee);
//
//            session.save(it);

            Department department = session.get(Department.class, 2);
            Department department2 = session.get(Department.class, 3);

            session.delete(department);
            session.delete(department2);

            session.getTransaction().commit();
        }

        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
