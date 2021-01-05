package com.company.decorater.ger;

public class Hudag extends DecoratorBuild{
    public Hudag(Build build) {
        super(build);
    }

    @Override
    public void makeBuild() {
        super.makeBuild();
        this.hudagUhah();
    }

    public void hudagUhah() {
        System.out.println("Hudag nemj uhlaa");
    }
}
