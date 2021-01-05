package com.company.decorater.ger;

public class Nogoo extends DecoratorBuild{
    public Nogoo(Build build) {
        super(build);
    }

    @Override
    public void makeBuild() {
        super.makeBuild();
        this.nogooTarih();
    }

    public void nogooTarih() {
        System.out.println("Nogoo nemj tarilaa");
    }
}
