package com.melnikov.spring.AOP;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Old man and the sea")
    private String name;

    @Value("Pushkin")
    private String author;

    @Value("1890")
    private int yearOfPub;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPub() {
        return yearOfPub;
    }
}
