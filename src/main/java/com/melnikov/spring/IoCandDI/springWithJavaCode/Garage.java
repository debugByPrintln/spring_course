package com.melnikov.spring.IoCandDI.springWithJavaCode;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class Garage {
    private static ArrayList<Car> garage = new ArrayList<>();

    public Garage() {
        System.out.println("garage is created");
    }

    public void carsParked(){
        for (Car car : garage) {
            System.out.println(garage.toString());
        }
    }

    public void parkCar(Car car){
        garage.add(car);
    }

    public ArrayList<Car> getGarage() {
        return garage;
    }

}
