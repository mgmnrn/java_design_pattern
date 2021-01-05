package com.company.observer.hollywood;

import java.util.ArrayList;
import java.util.List;

public class Director implements Subject {
    private List<Actor> actors = new ArrayList<>();
    private String name;

    Director(String name) {
        this.name = name;
    }

    @Override
    public void Register(Object o) {
        actors.add((Actor)o);
    }

    @Override
    public void UnRegister(Object o) {
        actors.remove((Actor) o);
    }

    @Override
    public void NotifyAll(Object o) {
        for (Actor actor : actors) {
            actor.phone(this.name + ": " + (String) o);
        }
    }
}