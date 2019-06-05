package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args){
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retriver();
        ProducktOrderService producktOrderService = new ProducktOrderService(
                new MailService(), new OrderProduct(), new ItemOrderRepository());
        producktOrderService.process(orderRequest);
    }
}
