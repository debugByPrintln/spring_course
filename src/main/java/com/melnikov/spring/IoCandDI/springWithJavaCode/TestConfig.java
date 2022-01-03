package com.melnikov.spring.IoCandDI.springWithJavaCode;

import com.melnikov.spring.IoCandDI.Cat;
import com.melnikov.spring.IoCandDI.Person;
import com.melnikov.spring.IoCandDI.Pet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

        Garage garage = context.getBean("garageBean", Garage.class);

        Mercedes mercedes = context.getBean("mercedesBean", Mercedes.class);
        BMW bmw = context.getBean("bmwBean", BMW.class);

        garage.parkCar(mercedes);
        garage.parkCar(bmw);

        garage.carsParked();

        context.close();
    }





}
