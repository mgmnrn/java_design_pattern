package com.company.decorater.ger;

public class Main {
    public static void main(String[] args) {
        Build ger = new Ger();
        ger.makeBuild();
        new Hashaa(ger).makeBuild();
        new Hudag(ger).makeBuild();
        new Suudrevch(ger).makeBuild();
        new Nogoo(ger).makeBuild();
    }
}
