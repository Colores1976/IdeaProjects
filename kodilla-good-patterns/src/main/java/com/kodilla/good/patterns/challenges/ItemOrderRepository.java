package com.kodilla.good.patterns.challenges;

public class ItemOrderRepository implements OrderRepository {
    @Override
    public boolean createOrder(User user, Item item, Quantity quantity) {
        return true;
    }
}
