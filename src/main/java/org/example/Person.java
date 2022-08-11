package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Animal animal;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

    public Person() {
    }

    @Autowired
    public Person(@Qualifier("panther") Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void callMyAnimal(){
        System.out.println("Любимое животное Датка: "+animal);
        animal.animalPlus();
        animal.animalMinus();
    }
    public void callYourAnimal(){
        System.out.println("Мое любимое животное : " +animal);
        animal.animalPlus();
        animal.animalMinus();
    }
    public void methodAnimal(Person person){
        if(person.getAnimal()instanceof Cat ){
           callMyAnimal();
        } else if (person.getAnimal()instanceof Panther){
            callYourAnimal();
        }
    }
}
