package com.melnikov.spring.IoCandDI;

import org.springframework.beans.factory.annotation.Value;


public class Person {
    private Pet pet;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

    public Person(Pet pet) {
        System.out.println("Person created and pet set");
        this.pet = pet;
    }

//    public Person(){
//        System.out.println("Person created");
//    }

    public void callPet(){
        System.out.println("Person calls pet");
        pet.say();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Set name");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Set age");
        this.age = age;
    }

    public void setPet(Pet pet) {
        System.out.println("Set pet");
        this.pet = pet;
    }

}
