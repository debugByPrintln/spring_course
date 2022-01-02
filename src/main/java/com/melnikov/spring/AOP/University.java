package com.melnikov.spring.AOP;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new LinkedList<>();

    public void addStudent(){
        Student st1 = new Student("A B", 2, 5.5);
        Student st2 = new Student("A C", 3, 5.6);
        Student st3 = new Student("A D", 5, 8.5);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Get Studs method start");
        System.out.println("Get studs info: " + students.toString());
        return students;
    }
}
