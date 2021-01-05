package com.company.flyweight.shape;

public class Durs implements Shape {
    private String name;
    private String color;
    private int size;

    public Durs(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println(name + " durs zurlaa. Unge: " + color + ", hemjee: " + size);
    }
}
