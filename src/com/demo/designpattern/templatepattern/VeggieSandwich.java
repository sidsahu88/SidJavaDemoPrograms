package com.demo.designpattern.templatepattern;

public class VeggieSandwich extends SandwichTemplate {

	@Override
	public Boolean isNonVegRequire() {
		return false;
	}

	@Override
	public Boolean isCheeseRequire() {
		return true;
	}

	@Override
	public Boolean isVeggiesRequire() {
		return true;
	}
	
	@Override
	public void addVeggies() {
		System.out.println("Cucumber, Bell pepper, Lettuce, Jalapeno added.");
	}

}
