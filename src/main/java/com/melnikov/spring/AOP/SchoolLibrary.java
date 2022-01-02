package com.melnikov.spring.AOP;

public class SchoolLibrary extends AbstractLibrary{
    @Override
    public void getBook() {
        System.out.println("School lib get book");
    }
}
