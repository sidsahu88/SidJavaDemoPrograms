package com.demo;

class Alpha {
	public String type1 = "a ";
	public String type2 = "b ";

	public Alpha() {
		System.out.print("alpha ");
	}
}

class Beta extends Alpha {
	public Beta() {
		System.out.print("beta ");
	}

	public void print() {
		type1 = "c ";

		System.out.print(this.type1 + this.type2 + super.type1 + super.type2);
	}
}

public class InterviewThisSuperDemo {

	public static void main(String[] args) {

		Beta beta = new Beta();

		beta.print();

	}

}
