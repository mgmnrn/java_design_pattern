package com.company.movie;

public class ContentDecorator implements Content{
    protected Content decoratedContent;

    public ContentDecorator(Content decoratedContent) {
        this.decoratedContent = decoratedContent;
    }

    @Override
    public void register() {
        decoratedContent.register();
    }
}
