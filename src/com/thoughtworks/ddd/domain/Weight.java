package com.thoughtworks.ddd.domain;

public class Weight {
    private double weight;
    private String unit;

    public Weight(double weight, String unit) {
        this.weight = weight;
        this.unit = unit;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Weight{" +
                "weight=" + weight +
                ", unit='" + unit + '\'' +
                '}';
    }
}
