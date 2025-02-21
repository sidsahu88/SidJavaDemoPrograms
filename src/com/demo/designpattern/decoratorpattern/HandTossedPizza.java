package com.demo.designpattern.decoratorpattern;

public class HandTossedPizza implements Pizza {

	@Override
	public String getIngredients() {
		return "\nHand Tossed Base - Rs. 150.00";
	}

	@Override
	public double getCost() {
		return 150.00;
	}

}
