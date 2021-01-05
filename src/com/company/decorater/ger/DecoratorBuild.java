package com.company.decorater.ger;

public class DecoratorBuild extends Ger {
    protected Build build;

    public DecoratorBuild(Build build) {
        this.build = build;
    }

    @Override
    public void makeBuild() {
        build.makeBuild();
    }
}
