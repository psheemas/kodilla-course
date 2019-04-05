package com.kodilla.good.patterns.food2door;

import java.util.HashSet;

public class FoodProducerCompany implements OrderPlacement {
    private String companyName;
    private HashSet<VegetablesAndFruits> availableFreshProducts;

    public FoodProducerCompany(String companyName, HashSet<VegetablesAndFruits> availableFreshProducts) {
        this.companyName = companyName;
        this.availableFreshProducts = availableFreshProducts;
    }

    @Override
    public void process() {
        System.out.println("Placing and order");
    }

    @Override
    public String companyName() {
        return this.companyName;
    }

    @Override
    public HashSet<VegetablesAndFruits> orderList() {
        return this.availableFreshProducts;
    }
}
