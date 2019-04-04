package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderedItems orderedItems;
    private OrderWarehouse orderWarehouse;

    public ProductOrderService(final InformationService informationService,
                               final OrderedItems orderedItems,
                               final OrderWarehouse orderWarehouse) {
        this.informationService = informationService;
        this.orderedItems = orderedItems;
        this.orderWarehouse = orderWarehouse;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderedItems.buyNow(orderRequest.getUser(), orderRequest.getItem());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderWarehouse.createOrder(orderRequest.getUser(), orderRequest.getItem());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}

