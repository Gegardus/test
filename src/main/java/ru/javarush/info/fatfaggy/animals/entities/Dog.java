package ru.javarush.info.fatfaggy.animals.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class Dog {
    private String name = "Rex";

    @Bean
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
