package com.demo.designpattern.decoratorpattern;

abstract class ToppingDecorator implements Pizza {

	protected Pizza pizza;

	public ToppingDecorator(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	public String getIngredients() {
		return pizza.getIngredients();
	}

	public double getCost() {
		return pizza.getCost();
	}

}
