package com.demo.multithreading;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Slf4j
class OrderCreation {

    public int getOrder(int order) {
        log.info("Order " + order + " created.");

        return order;
    }

    public int enrichOrder(int order) {
        log.info("Order " + order + " enriched.");

        return order;
    }

    public int performPayment(int order) {
        log.info("Order " + order + " paid.");

        return order;
    }

    public int dispatch(int order) {
        log.info("Order " + order + " dispatched.");

        return order;
    }

    public int sendEmail(int order) {
        log.info("Order " + order + " email sent.");

        return order;
    }

}

public class CompletableFutureOrderDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        OrderCreation order = new OrderCreation();

        CompletableFuture<Void> future1 = CompletableFuture.supplyAsync(() -> order.getOrder(1)).thenApply(order::enrichOrder)
                .thenApply(order::performPayment).thenApply(order::dispatch)
                .thenAccept(order::sendEmail);

        CompletableFuture<Void> future2 = CompletableFuture.supplyAsync(() -> order.getOrder(2)).thenApply(order::enrichOrder)
                .thenApply(order::performPayment).thenApply(order::dispatch)
                .thenAccept(order::sendEmail);

        CompletableFuture<Void> future3 = CompletableFuture.supplyAsync(() -> order.getOrder(3)).thenApply(order::enrichOrder)
                .thenApply(order::performPayment).thenApply(order::dispatch)
                .thenAccept(order::sendEmail);

        CompletableFuture<Void> future4 = CompletableFuture.supplyAsync(() -> order.getOrder(4)).thenApply(order::enrichOrder)
                .thenApply(order::performPayment).thenApply(order::dispatch)
                .thenAccept(order::sendEmail);

        CompletableFuture<Void> future5 = CompletableFuture.supplyAsync(() -> order.getOrder(5)).thenApply(order::enrichOrder)
                .thenApply(order::performPayment).thenApply(order::dispatch)
                .thenAccept(order::sendEmail);

        CompletableFuture.allOf(future1, future2, future3, future4, future5).get();

    }

}
