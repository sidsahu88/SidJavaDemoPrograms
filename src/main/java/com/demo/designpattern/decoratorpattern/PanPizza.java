package com.demo.designpattern.decoratorpattern;

public class PanPizza implements Pizza {

	@Override
	public String getIngredients() {
		return "\nPan Base - Rs. 100.00";
	}

	@Override
	public double getCost() {
		return 100.00;
	}

}
