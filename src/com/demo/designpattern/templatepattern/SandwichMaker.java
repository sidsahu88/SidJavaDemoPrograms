package com.demo.designpattern.templatepattern;

public class SandwichMaker {

	public static void main(String[] args) {
	
		SandwichTemplate chickenSW = new ChickenSandwich();
		SandwichTemplate veggieSW = new VeggieSandwich();
		
		chickenSW.makeSandwich();
		System.out.println();
		veggieSW.makeSandwich();

	}

}
