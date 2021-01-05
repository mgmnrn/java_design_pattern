package com.company.movie;

public class Main {
    public static void main(String[] args) {
        Content kino = new MainContent("Har suvdnii nuuts2");
        Content concert = new MainContent("Javhlan nutagaa sanana");
        Content drama = new MainContent("Mongoldoo bid hairtai");

        Content movie = new Movie(kino);
        Content jujig = new Drama(drama);
        Content toglolt = new Concert(concert);
        movie.register();
        jujig.register();
        toglolt.register();
    }
}
