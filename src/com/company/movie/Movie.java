package com.company.movie;

public class Movie extends ContentDecorator {
    public Movie(Content decoratedContent) {
        super(decoratedContent);
    }

    @Override
    public void register() {
        decoratedContent.register();
        addGenre(decoratedContent);
    }

    private void addGenre(Content decoratedContent) {
        System.out.println("Kino burtgej avlaa");
    }
}
