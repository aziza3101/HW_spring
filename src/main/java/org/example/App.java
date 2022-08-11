package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Person person = context.getBean("person",Person.class);
        System.out.println(person.getName()+" " + person.getAge() + " лет");
        person.methodAnimal(person);

    }
}
