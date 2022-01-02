package com.melnikov.spring.IoCandDI.springWithJavaCode;

import com.melnikov.spring.IoCandDI.Cat;
import com.melnikov.spring.IoCandDI.Person;
import com.melnikov.spring.IoCandDI.Pet;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:cars.properties")
public class MyConfiguration {

    @Bean
    @Scope("singleton")
    public Garage garageBean(){
        return new Garage();
    }

    @Bean
    @Scope("prototype")
    public BMW bmwBean(){
        return new BMW();
    }

    @Bean
    @Scope("prototype")
    public Mercedes mercedesBean(){
        return new Mercedes();
    }

}
