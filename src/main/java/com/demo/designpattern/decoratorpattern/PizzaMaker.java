package com.demo.designpattern.decoratorpattern;

public class PizzaMaker {

	public static void main(String[] args) {

		Pizza chickenMozHandPizza = new ChickenPizza(new MozzarellaPizza(new HandTossedPizza()));

		Pizza chickenPanPizza = new ChickenPizza(new PanPizza());
		
		Pizza mozPanPizza = new MozzarellaPizza(new HandTossedPizza());

		System.out.println("Chicken Moz Pizza Ingredients: " + chickenMozHandPizza.getIngredients());
		System.out.println("Chicken Moz Pizza Total Cost: " + chickenMozHandPizza.getCost());
		
		System.out.println();
		
		System.out.println("Chicken Pizza Ingredients: " + chickenPanPizza.getIngredients());
		System.out.println("Chicken Pizza Total Cost: " + chickenPanPizza.getCost());
		
		System.out.println();
		
		System.out.println("Mozzarella Pizza Ingredients: " + mozPanPizza.getIngredients());
		System.out.println("Mozzarella Pizza Total Cost: " + mozPanPizza.getCost());

	}

}
