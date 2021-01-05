package com.company.decorater.ger;

public class Suudrevch extends DecoratorBuild{
    public Suudrevch(Build build) {
        super(build);
    }

    @Override
    public void makeBuild() {
        super.makeBuild();
        this.suudrevch();
    }

    public void suudrevch() {
        System.out.println("Suudrevch nemj barilaa");
    }
}
