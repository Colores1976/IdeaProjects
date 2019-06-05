package com.kodilla.good.patterns.challenges;

public class OrderProduct implements OrderService {

    public boolean order(User user, Item item, Quantity quantity){
        System.out.println(user.getName() + " " + user.getSurname() + " właśnie zamówiłeś: " + item.getName() + ": " + "w cenie: " + item.getPrice());
        return true;
    }
}
