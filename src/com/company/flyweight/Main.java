package com.company.flyweight;

public class Main {
    public static void main(String[] args) {
        Bucket bucket = new Bucket();
        bucket.executeOrder("Mackbook", 1);
        bucket.executeOrder("Samsung tv", 33);
        bucket.executeOrder("LG phone", 23);
        bucket.executeOrder("Mackbook", 2);
        bucket.process();
        System.out.println(bucket.getTotalProducts());
    }
}
