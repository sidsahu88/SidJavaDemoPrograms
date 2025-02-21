package com.demo;

public class InitializedStaticConstructorBlockOrderDemo {
	{
		System.out.println("Initialised block 1.");
	}

	{
		System.out.println("Initialised block 2.");
	}

	static {
		System.out.println("Static block 1.");
	}

	static {
		System.out.println("Static block 2.");
	}

	InitializedStaticConstructorBlockOrderDemo() {
		System.out.println("Non parameterized constructor 1.");
	}

	InitializedStaticConstructorBlockOrderDemo(int i) {
		System.out.println("Parameterized constructor " + i + ".");
	}

	public static void main(String[] args) {
		
		System.out.println("Main method");
		
		InitializedStaticConstructorBlockOrderDemo isc = new InitializedStaticConstructorBlockOrderDemo();
		InitializedStaticConstructorBlockOrderDemo isc2 = new InitializedStaticConstructorBlockOrderDemo(2);
		
	}

}
