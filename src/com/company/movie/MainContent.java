package com.company.movie;

public class MainContent implements Content {
    private String name;

    public MainContent(String name) {
        this.name = name;
    }

    @Override
    public void register() {
        System.out.println(name);
    }
}
