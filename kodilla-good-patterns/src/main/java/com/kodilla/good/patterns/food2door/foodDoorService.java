package com.kodilla.good.patterns.food2door;

public class foodDoorService {
    public static void main(String[] args) {
        AvailableFreshProducts availableFreshProducts = new AvailableFreshProducts();
        FoodProducerCompany foodProducerCompany = new FoodProducerCompany("HealthyShop",availableFreshProducts.getItemsAvailable());

        System.out.println(foodProducerCompany.orderList());
        System.out.println(foodProducerCompany.companyName());
        foodProducerCompany.process();
    }
}
