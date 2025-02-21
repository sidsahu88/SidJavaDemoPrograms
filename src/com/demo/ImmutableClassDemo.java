package com.demo;

final class ImmutableClass {				//Final class to stop inheritance.
	
	private final String name;				//Final member variable to stop changing the value later after object creation.

	public ImmutableClass(String name) {    //A parameterized constructor
		super();
		this.name = name;
	}
	
	public String getName() {				//Getters for all member variables and no setters 
		return name;
	}
	
}

public class ImmutableClassDemo {

	public static void main(String[] args) {
		ImmutableClass ic = new ImmutableClass("Immutable Class Demo");
		//ImmutableClass ic1 = new ImmutableClass();       //Not Working.
		
		//ic.name = "Trying to change Variable";           //Not Working.
		
		System.out.println("This is "+ic.getName());
		
	}

}
