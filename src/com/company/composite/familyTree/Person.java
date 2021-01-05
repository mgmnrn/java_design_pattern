package com.company.composite.familyTree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Person> persons;

    public Person(String name) {
        this.name = name;
        persons = new ArrayList<>();
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void display(String ovog, int number) {
        System.out.println("-".repeat(number) + ovog + " овогтой " + name);
        persons.forEach(person -> {
            person.display(name, number+5);
        });
    }
}
