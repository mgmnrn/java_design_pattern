package com.company.movie;

public class Drama extends ContentDecorator{
    public Drama(Content decoratedContent) {
        super(decoratedContent);
    }

    @Override
    public void register() {
        decoratedContent.register();
        addGenre(decoratedContent);
    }

    private void addGenre(Content decoratedContent) {
        System.out.println("Jujig burtgej avlaa");
    }
}
