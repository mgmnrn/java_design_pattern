package com.company.decorater.ger;

public class Hashaa extends DecoratorBuild{

    public Hashaa(Build build) {
        super(build);
    }

    @Override
    public void makeBuild() {
        super.makeBuild();
        this.hashaaBarih();
    }

    public void hashaaBarih() {
        System.out.println("Hashaa nemj barilaa");
    }
}
