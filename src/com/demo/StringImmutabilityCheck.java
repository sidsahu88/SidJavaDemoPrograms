package com.demo;

public class StringImmutabilityCheck {

	public static void main(String[] args) {
		
		String str = new String("abc");
		str="xyz";         //Created a new Object.
		
		str.concat("abc"); //VM creates new string but nothing refers to it. So, this new string is lost. 
		
		System.out.println(str);

	}

}
