package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private User user;
    private Item item;
    private Quantity quantity;

    public OrderRequest(User user, Item item, Quantity quantity) {
        this.user = user;
        this.item = item;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
