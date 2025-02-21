package com.demo.designpattern.decoratorpattern;

public class ChickenPizza extends ToppingDecorator {

	public ChickenPizza(Pizza pizza) {
		super(pizza);
	}

	public String getIngredients() {
		return pizza.getIngredients() + "\nTandoori Chicken - Rs. 50.00";
	}

	public double getCost() {
		return pizza.getCost() + 50.00;
	}

}
