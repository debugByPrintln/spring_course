package com.melnikov.spring.hibernate_many_to_many;

import com.melnikov.spring.hibernate_many_to_many.entity.Child;
import com.melnikov.spring.hibernate_many_to_many.entity.Section;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class Test {
    public static void main(String[] args) {
        try(SessionFactory sessionFactory = new Configuration()
                        .addAnnotatedClass(Child.class)
                        .addAnnotatedClass(Section.class)
                        .configure("hibernate.cfg.xml")
                        .buildSessionFactory();
                Session session = sessionFactory.getCurrentSession()){

//            Section section = new Section("Math");
//
//            Child child = new Child("Jora", 12);


            session.beginTransaction();

//            child.addSectionToChild(section);
//            session.persist(child);

            Child d = session.get(Child.class, 12);
            session.delete(d);

            session.getTransaction().commit();

        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
