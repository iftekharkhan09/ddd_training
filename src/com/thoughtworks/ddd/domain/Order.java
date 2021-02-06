package com.thoughtworks.ddd.domain;

import java.util.List;

public class Order {
    private List<Product> products;

    public Order(List<Product> products) {
        this.products = products;
    }

    public double getTotalAmount() {
        return this.products.stream().map(product -> product.price.getAmount() + 0.01 * product.weight.getWeight())
                .reduce(0.0, Double::sum);
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                '}';
    }
}
