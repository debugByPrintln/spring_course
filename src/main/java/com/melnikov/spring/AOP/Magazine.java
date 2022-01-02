package com.melnikov.spring.AOP;

import org.springframework.beans.factory.annotation.Value;

public class Magazine {
    @Value("Fashion 2020")
    private String name;

    @Value("Putin")
    private String author;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
