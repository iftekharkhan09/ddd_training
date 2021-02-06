package com.thoughtworks.ddd.domain.domain_service;

import com.thoughtworks.ddd.domain.Cart;
import com.thoughtworks.ddd.domain.Item;
import com.thoughtworks.ddd.domain.Order;
import com.thoughtworks.ddd.domain.Product;

import java.util.List;
import java.util.stream.Collectors;

public class OrderService {
    public static Order getOrder(Cart cart) {
        List<Product> productList = cart.getItems().stream().map(Item::getProduct).collect(Collectors.toList());
        return new Order(productList);
    }
}
