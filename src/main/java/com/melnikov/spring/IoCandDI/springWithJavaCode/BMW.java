package com.melnikov.spring.IoCandDI.springWithJavaCode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class BMW implements Car{
    @Value("${car.wheels}")
    private int wheels;
    @Value("${car.doors}")
    private int doors;


    private static int hp = 300;

    public BMW() {
        System.out.println("BMW is created");
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void shutDownEngine() {

    }

    @Override
    public String toString() {
        return "BMW{" +
                "wheels=" + wheels +
                ", doors=" + doors +
                '}';
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
