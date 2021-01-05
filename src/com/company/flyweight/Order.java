package com.company.flyweight;

public class Order {
    private final int orderNumber;
    private final Product product;

    public Order(int orderNumber, Product product) {
        this.orderNumber = orderNumber;
        this.product = product;
    }

    void processOrder() {
        System.out.println(product + "энэ бараанд захиалга хийгдлээ. Дугаар: " + orderNumber);
    }
}
