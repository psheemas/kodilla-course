package com.kodilla.good.patterns.food2door;

import java.util.HashSet;

public interface OrderPlacement {
    public void process();
    public String companyName();
    public HashSet<VegetablesAndFruits> orderList();
}
