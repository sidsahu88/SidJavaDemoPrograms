package com.demo;

interface iFruit {
	public String TYPE = "Apple";
}

class Fruit implements iFruit {

}

public class TrickyJavaQues {

	public static void main(String[] args) {

		System.out.println("Answer 1:");
		// Question 1
		// the line below this gives an output

		// \u000d System.out.println("comment executed");

		
		// Question 2
		String s = "ONE" + 1 + 2 + "TWO" + "THREE" + 3 + 4 + "FOUR" + "FIVE" + 5;

		System.out.println("\nAnswer 2:");
		System.out.println(s);

		
		// Question 3
		int i = 10 + +11 - -12 + +13 - -14 + +15;
		System.out.println("\nAnswer 3:");
		System.out.println(i);

		
		// Question 4
		String one = "Random";
		String two = "RAndom";

		System.out.println("\nAnswer 4:");
		if (one == two)
			System.out.println("one==two");
		else
			System.out.println("one!=two");

		
		// Question 5
		System.out.println("\nAnswer 5:");
		System.out.println(Fruit.TYPE);

		
		// Question 6
		Integer i1 = 127;
		Integer i2 = 127;

		System.out.println("\nAnswer 6:");
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));

		Integer i3 = 128;
		Integer i4 = 128;

		System.out.println(i3 == i4); // This will return false because both the objects i3 and i4 points to
										// two different memory location. Values less than 128 can be stored in
										// cache and access by multiple objects. But for values greater than equal
										// to 128 cache will not be used and will be stored at different memory
										// locations. Same is applicable for Byte, Short, Long and Character, but
										// not for Float and Double.
		System.out.println(i3.equals(i4));
		

		// Question 7
		System.out.println("\nAnswer 7:");
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println(Double.MIN_VALUE);

		
		// Question 8
		long numWithL = 1000 * 60 * 60 * 24 * 365L;   //Forcefully hold the long value in the variable.
		long numWithoutL = 1000 * 60 * 60 * 24 * 365; //Convert the long into Integer and store it in the variable.

		System.out.println("\nAnswer 8:");
		System.out.println(numWithL + " " + numWithoutL);
		
		
		// Question 9
		System.out.println("\nAnswer 9:");
		System.out.println(a);
		
		
		// Question 10
		int $_ = 5;
		
		System.out.println("\nAnswer 10:");
		System.out.println($_);
		
		// Question 11
		int[] arr = new int[5];
		
		System.out.println("\nAnswer 11:");
		System.out.println(arr);
		
	}
	
	// Question 9
	static int a = 1111;
	
	static {
		a = a-- - --a; //1111 - 1109 = 2
	}
	
	{
		a = a++ + ++a;
	}

}