package com.melnikov.spring.IoCandDI.springWithJavaCode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Mercedes implements Car{
    @Value("${car.wheels}")
    private int wheels;
    @Value("${car.doors}")
    private int doors;

    private static int hp = 200;

    public Mercedes() {
        System.out.println("mercedes is created");
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void shutDownEngine() {

    }

    @Override
    public String toString() {
        return "Mercedes{" +
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
