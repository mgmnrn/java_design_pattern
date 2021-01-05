package com.company.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Portfolio {
    private final Map<String, Product> products = new HashMap<>();

    public  Product lookup(String productName) {
        if (!products.containsKey(productName))
            products.put(productName, new Product(productName));
        return products.get(productName);
    }

    public int totalProductsMade() {
        return products.size();
    }
}
