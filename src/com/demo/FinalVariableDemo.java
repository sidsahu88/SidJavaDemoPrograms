package com.demo;


public class FinalVariableDemo {

	public static void main(String[] args) {
		final int i = 1;
		final String str;
		final java.util.LinkedList<Integer> ilist = new java.util.LinkedList<Integer>();
		
		System.out.println(i);
		
		//i = 2; 			// Cannot reassign value
		
		str = "abc";
		System.out.println(str);
		
		//str = "123";		// Cannot reassign value
		//str = str+"123";	// Cannot reassign value
		
		// Adding elements to final list
		ilist.add(10);
		ilist.add(20);
		ilist.add(30);
		System.out.println(ilist);
		
		// Adding few more elements to final list
		ilist.add(40);
		ilist.add(50);
		System.out.println(ilist);
		
		// Removing a element from final list
		ilist.remove(3);
		System.out.println(ilist);
		
		
		//ilist = new java.util.LinkedList<>(); // Cannot reassign to new object		
	}

}
