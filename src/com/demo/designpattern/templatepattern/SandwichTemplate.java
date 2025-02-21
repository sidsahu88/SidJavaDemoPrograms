package com.demo.designpattern.templatepattern;

abstract class SandwichTemplate {

	//Template Method.
	public final void makeSandwich() {
		
		selectBread();
		
		if(isNonVegRequire())
			addChicken();
		
		if(isCheeseRequire())
			addCheese();
		
		if(isVeggiesRequire())
			addVeggies();
		
		addSauces();
		
		wrapNGrill();
	}
	
	private void selectBread() {
		System.out.println("Preparing your Sandwich... \nBread selected.");
	}
	
	public abstract Boolean isNonVegRequire();
	
	private void addChicken() {
		System.out.println("Chicken added.");
	}
	
	public abstract Boolean isCheeseRequire();
	
	private void addCheese() {
		System.out.println("Cheese added.");
	}
	
	public abstract Boolean isVeggiesRequire();
	
	public void addVeggies() {
		System.out.println("Vegetables added.");
	}
	
	public void addSauces() {
		System.out.println("Sauces added.");
	}
	
	private void wrapNGrill() {
		System.out.println("Sandwich wrapped and grilled.\nThank you for ordering.");
	}
}
