package com.kodilla.good.patterns.food2door;

import java.util.HashSet;

public class AvailableFreshProducts {
    public HashSet<VegetablesAndFruits> getItemsAvailable(){

        VegetablesAndFruits potatoes = new VegetablesAndFruits(5, "Ziemniaki");
        VegetablesAndFruits tomatoes = new VegetablesAndFruits(3, "Pomidory");
        VegetablesAndFruits cucumbers = new VegetablesAndFruits(7, "Ogórki");
        VegetablesAndFruits broccoli = new VegetablesAndFruits(9, "Brokuły");

        VegetablesAndFruits apples = new VegetablesAndFruits(12, "Jabłka");
        VegetablesAndFruits peaches = new VegetablesAndFruits(12, "Brzoskwinie");
        VegetablesAndFruits strawberries = new VegetablesAndFruits(12, "Truskawki");
        VegetablesAndFruits grapes = new VegetablesAndFruits(12, "Winogrona");


        HashSet<VegetablesAndFruits> availVegFrui = new HashSet<VegetablesAndFruits>();
        availVegFrui.add(potatoes);
        availVegFrui.add(tomatoes);
        availVegFrui.add(cucumbers);
        availVegFrui.add(broccoli);
        availVegFrui.add(apples);
        availVegFrui.add(peaches);
        availVegFrui.add(strawberries);
        availVegFrui.add(grapes);
        return availVegFrui;

    }
}
