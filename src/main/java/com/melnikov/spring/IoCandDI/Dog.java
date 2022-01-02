package com.melnikov.spring.IoCandDI;


public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog created");
    }

    public void init(){
        System.out.println("Dog init method");
    }

    public void destroy(){
        System.out.println("Dog destroy method");
    }

    @Override
    public void say() {
        System.out.println("Gav-Gav");
    }
}
