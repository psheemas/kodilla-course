package com.kodilla.good.patterns.challenges;

public class ProductOrderServiceMain {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new InformationService(),new OrderedItems(),new OrderWarehouse());
        productOrderService.process(orderRequest);

    }
}
