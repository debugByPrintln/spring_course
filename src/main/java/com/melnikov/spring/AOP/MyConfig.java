package com.melnikov.spring.AOP;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.melnikov.spring.AOP")
@EnableAspectJAutoProxy
public class MyConfig {
    @Bean
    public SchoolLibrary schoolLibraryBean(){
        return new SchoolLibrary();
    }

    @Bean
    public UniversityLibrary universityLibraryBean(){
        return new UniversityLibrary();
    }

    @Bean
    public Book bookBean(){
        return new Book();
    }

    @Bean
    public University universityBean(){
        return new University();
    }

    @Bean
    public Magazine magazineBean(){
        return new Magazine();
    }
}
