package com.demo.designpattern.decoratorpattern;

public class MozzarellaPizza extends ToppingDecorator {

	public MozzarellaPizza(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getIngredients() {
		return pizza.getIngredients() + "\nMozzarella Cheese - Rs. 30.00";
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 30.00;
	}

}
