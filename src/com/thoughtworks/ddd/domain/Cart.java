package com.thoughtworks.ddd.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

public class Cart {
    private final UUID identifier;
    private final List<Item> items;
    private final List<Item> deletedItems;
    private boolean isCheckedOut;

    public Cart() {
        identifier = UUID.randomUUID();
        items = new ArrayList<>();
        deletedItems = new ArrayList<>();
    }

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        deletedItems.add(item);
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public List<Item> getDeletedItems() {
        return deletedItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return this.identifier.equals(cart.identifier);
    }

    public void checkout(){
        this.setCheckedOut(true);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier);
    }

    private void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public List<Product> getCheckoutItems(Cart cart) {
        return this.items.stream().map(Item::getProduct).collect(Collectors.toList());
    }
}

