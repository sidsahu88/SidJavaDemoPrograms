package com.demo;

class Alpha {
	public String type = "a ";

	public Alpha() {
		System.out.print("alpha ");
	}
}

class Beta extends Alpha {
	public Beta() {
		System.out.print("beta ");
	}

	public void print() {
		type = "b ";

		System.out.print(this.type + super.type);
	}
}

public class InterviewThisSuperDemo {

	public static void main(String[] args) {

		Beta beta = new Beta();

		beta.print();

	}

}
