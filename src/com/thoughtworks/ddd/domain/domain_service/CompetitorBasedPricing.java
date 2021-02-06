package com.thoughtworks.ddd.domain.domain_service;

import java.util.HashMap;
import java.util.Map;

public class CompetitorBasedPricing {
    private static Map<String, Double> competitorProductsWithPrice = new HashMap<>();

    static {
        competitorProductsWithPrice.put("IPad Pro", 100000.0);
        competitorProductsWithPrice.put("Hero Ink Pen", 90.0);
        competitorProductsWithPrice.put("GM Cricket Bat", 9000.0);
    }

    public static double getPrice(String  productName){
        return competitorProductsWithPrice.get(productName) - 0.1 * competitorProductsWithPrice.get(productName);
    }
}
