package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Cat implements Animal{
    @Value("${cat.breed}")
    private String breed;
    @Value("${cat.color}")
    private String color;
    @Value("${cat.age}")
    private int age;

    public Cat() {
    }
    @Override
    public void animalPlus() {
        System.out.println("Плюсы кошек: Кошка отлично снимает стресс");
    }
    @Override
    public void animalMinus() {
        System.out.println("Минусы кошек: У кошек острые когти");
    }

    @Override
    public String toString() {
        return "Cat: " +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age;
    }
}

