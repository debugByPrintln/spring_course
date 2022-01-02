package com.melnikov.spring.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("Main start");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        University university = context.getBean("universityBean", University.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibraryBean", UniversityLibrary.class);

        String bookName = universityLibrary.returnBook();
        System.out.println(bookName);

//        UniversityLibrary uniLibrary = context.getBean("universityLibraryBean", UniversityLibrary.class);
//        Book book = context.getBean("bookBean", Book.class);
//        Magazine magazine = context.getBean("magazineBean", Magazine.class);
//
//        uniLibrary.getBook();
//
//        uniLibrary.addBook("Toha", book);
//        uniLibrary.addMagazine("Jora", magazine);


        context.close();
        System.out.println("Main end");
    }
}
