package com.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee("Siddharth", 31);
		Employee e2 = new Employee("Rajesh", 29);
		Employee e3 = new Employee("Satish", 36);
		Employee e4 = new Employee("Pankaj", 33);

		List<Employee> empList = Arrays.asList(e1, e2, e3, e4);

		List<Employee> output = empList.stream().filter(e -> e.getAge() > 30 && e.getAge() < 35)
				.collect(Collectors.toList());

		output.stream().forEach((e) -> System.out.println(e.getName()));

		int sumOfAge = empList.stream().mapToInt(e -> e.getAge()).sum();

		System.out.println(sumOfAge);

	}

}

class Employee {
	String name;
	int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}