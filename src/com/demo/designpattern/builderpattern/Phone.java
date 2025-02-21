package com.demo.designpattern.builderpattern;

public class Phone {

	private String brand;
	private String os;
	private int screenSize;
	private int ram;
	private int battery;

	public Phone(String brand, String os, int screenSize, int ram, int battery) {
		super();
		this.brand = brand;
		this.os = os;
		this.screenSize = screenSize;
		this.ram = ram;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone [brand=" + brand + ", os=" + os + ", screenSize=" + screenSize + ", ram=" + ram + ", battery="
				+ battery + "]";
	}

}
