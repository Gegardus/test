package ru.javarush.info.fatfaggy.animals.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.javarush.info.fatfaggy.animals.entities.Cat;
import ru.javarush.info.fatfaggy.animals.entities.Dog;
import ru.javarush.info.fatfaggy.animals.entities.Parrot;

@Configuration
public class MyConfig {

    @Bean
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killer");
        return cat;
    }

    @Bean("parrot-kesha")
    public Parrot weNeedMoreParrots() {
        return new Parrot();
    }

    @Bean("dog")
    public Dog getDog() {
        return new Dog();
    }
}
