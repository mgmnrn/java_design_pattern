package com.company.movie;

public class Concert extends ContentDecorator {

    public Concert(Content decoratedContent) {
        super(decoratedContent);
    }

    @Override
    public void register() {
        decoratedContent.register();
        addGenre(decoratedContent);
    }

    private void addGenre(Content decoratedContent) {
        System.out.println("Concert burtgej avlaa");
    }
}
