package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Panther implements Animal{
    @Value("${panther.breed}")
    private String breed;
    @Value("${panther.color}")
    private String color;
    @Value("${panther.speed}")
    private int speed;

    public Panther() {
    }
    @Override
    public void animalPlus() {
        System.out.println("Плюсы пантеры: Самое сильное животное");
    }
    @Override
    public void animalMinus() {
        System.out.println("Минусы пантеры: Очень опасный хищник");
    }
    @Override
    public String toString() {
        return "Panther: " +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed;
    }
}
