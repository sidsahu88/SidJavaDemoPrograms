package com.demo.designpattern.builderpattern;

/*Builder pattern aims to separate the construction of a complex object from
 *its representation so that the same construction process can create different 
 *representations. It is used to construct a complex object step by step and
 *the final step will return the object. The process of constructing an object 
 *should be generic so that it can be used to create different representations 
 *of the same object.*/

public class PhoneBuilder {

	private String brand;
	private String os;
	private int screenSize;
	private int ram;
	private int battery;

	public PhoneBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}

	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}

	public PhoneBuilder setScreenSize(int screenSize) {
		this.screenSize = screenSize;
		return this;
	}

	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}

	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}

	public Phone buildPhone() {
		return new Phone(brand, os, screenSize, ram, battery);
	}
}
