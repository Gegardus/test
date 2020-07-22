package ru.javarush.info.fatfaggy.animals.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class Parrot {
    private String name = "Cash";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
