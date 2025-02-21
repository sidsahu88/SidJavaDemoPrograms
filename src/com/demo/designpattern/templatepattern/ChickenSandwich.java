package com.demo.designpattern.templatepattern;

public class ChickenSandwich extends SandwichTemplate{

	@Override
	public Boolean isNonVegRequire() {
		return true;
	}

	@Override
	public Boolean isCheeseRequire() {
		return false;
	}

	@Override
	public Boolean isVeggiesRequire() {
		return true;
	}
	
	@Override
	public void addSauces() {
		System.out.println("Barbeque Sauce and Mayonnaise added.");
	}

}
