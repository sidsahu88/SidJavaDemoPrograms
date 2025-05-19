package com.demo.multithreading;

import java.util.concurrent.CompletableFuture;

class OrderCreation {

	public int getOrder(int order) {
		System.out.println("Order " + order + " created.");

		return order;
	}

	public int enrichOrder(int order) {
		System.out.println("Order " + order + " enriched.");

		return order;
	}

	public int performPayment(int order) {
		System.out.println("Order " + order + " paid.");

		return order;
	}

	public int dispatch(int order) {
		System.out.println("Order " + order + " dispatched.");

		return order;
	}

	public int sendEmail(int order) {
		System.out.println("Order " + order + " email sent.");

		return order;
	}

}

public class CompletableFutureOrderDemo {

	public static void main(String[] args) {

		OrderCreation order = new OrderCreation();

		CompletableFuture.supplyAsync(() -> order.getOrder(1)).thenApply((ordId) -> order.enrichOrder(ordId))
				.thenApply((ordId) -> order.performPayment(ordId)).thenApply((ordId) -> order.dispatch(ordId))
				.thenAccept((ordId) -> order.sendEmail(ordId));
		
		CompletableFuture.supplyAsync(() -> order.getOrder(2)).thenApply((ordId) -> order.enrichOrder(ordId))
		.thenApply((ordId) -> order.performPayment(ordId)).thenApply((ordId) -> order.dispatch(ordId))
		.thenAccept((ordId) -> order.sendEmail(ordId));
		
		CompletableFuture.supplyAsync(() -> order.getOrder(3)).thenApply((ordId) -> order.enrichOrder(ordId))
		.thenApply((ordId) -> order.performPayment(ordId)).thenApply((ordId) -> order.dispatch(ordId))
		.thenAccept((ordId) -> order.sendEmail(ordId));
		
		CompletableFuture.supplyAsync(() -> order.getOrder(4)).thenApply((ordId) -> order.enrichOrder(ordId))
		.thenApply((ordId) -> order.performPayment(ordId)).thenApply((ordId) -> order.dispatch(ordId))
		.thenAccept((ordId) -> order.sendEmail(ordId));
		
		CompletableFuture.supplyAsync(() -> order.getOrder(5)).thenApply((ordId) -> order.enrichOrder(ordId))
		.thenApply((ordId) -> order.performPayment(ordId)).thenApply((ordId) -> order.dispatch(ordId))
		.thenAccept((ordId) -> order.sendEmail(ordId));

	}

}
