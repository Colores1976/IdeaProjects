package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriver {

    public OrderRequest retriver() {
        User user = new User("John", "Smith");
        Item item = new Item("Myszka", 12.50);
        Quantity quantity = new Quantity(1);
        return new OrderRequest(user, item, quantity);
    }
}
