package com.kodilla.good.patterns.challenges;

public class OrderWarehouse {
    public void createOrder(User user, Item item) {
        System.out.println("Ordered item: " + item.getItemName() + " for user : " + user.getUserName() + " sent to orderWarehouse");

    }
}
