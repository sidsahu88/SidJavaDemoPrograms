package com.demo.designpattern.builderpattern;

public class PhoneShop {

	public static void main(String[] args) {

		Phone samsung = new PhoneBuilder().setBrand("Samsung").setOs("Android").setRam(4).setBattery(5000).buildPhone();
		
		System.out.println(samsung);
		
		Phone iphone = new PhoneBuilder().setBrand("IPhone").setOs("iOS").setBattery(6000).setScreenSize(6).buildPhone();
		
		System.out.println(iphone);

	}

}
