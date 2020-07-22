package ru.javarush.info.fatfaggy.animals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.javarush.info.fatfaggy.animals.configs.DayConfig;
import ru.javarush.info.fatfaggy.animals.configs.MyConfig;
import ru.javarush.info.fatfaggy.animals.entities.Cat;
import ru.javarush.info.fatfaggy.animals.entities.Dog;
import ru.javarush.info.fatfaggy.animals.entities.Parrot;
import ru.javarush.info.fatfaggy.animals.entities.WeekDay;

public class Main {

    public static void main(String[] args) {

        // создаем пустой спринговый контекст, который будет искать свои бины по аннотациям в указанном пакете
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext("ru.javarush.info.fatfaggy.animals.entities");

        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class, DayConfig.class);

        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("dog");
        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());

        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println("It's " + weekDay.getWeekDayName() + " today!");

    }
}
