package com.demo;

class Writer {
	public static void print() {
		System.out.println("Writing...");
	}
}

class Programmer extends Writer {
	public static void print() {
		System.out.println("Writing Program...");
	}
}

class JavaProgrammer extends Programmer {
	public static void print() {
		System.out.println("Writing Java Program...");
	}
}

public class InterviewStaticMultilevelInheritanceDemo {

	public static void main(String[] args) {
		
		Writer jp = new JavaProgrammer();
		jp.print();
		
		Writer p = new Programmer();
		p.print();
		
		JavaProgrammer w = new JavaProgrammer();
		w.print();

	}

}
