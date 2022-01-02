package com.melnikov.spring.AOP;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary{

    public void addBook(String personName, Book book){
        System.out.println("Uni library add book");
        System.out.println("-----------------------------------------");
    }

    public void addMagazine(String personName, Magazine magazine){
        System.out.println("Uni library add magazine");
        System.out.println("-----------------------------------------");
    }

    public void getBook(){
        System.out.println("Uni library get book");
        System.out.println("-----------------------------------------");
    }

    public void getMagazine(){
        System.out.println("Uni library get magazine");
        System.out.println("-----------------------------------------");
    }

    public String returnBook(){
        int i = 10/0;
        System.out.println("Uni library return book");
        return "War and piece";
    }

    public void returnMagazine(){
        System.out.println("Uni library return magazine");
        System.out.println("-----------------------------------------");
    }


}
