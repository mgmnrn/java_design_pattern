package com.company.observer.hollywood;

public class Actor implements Observer{
    private String name;

    Actor(String name) {
        this.name = name;
    }

    void phone(String message) {
        System.out.println(this.name + " sms avlaa: " + message);
    }

    void isDirector(Director bat) {
        bat.Register(this);
    }

    @Override
    public void update(Object o) {
        System.out.println(this.name + " sms avlaa: " + o);
    }
}