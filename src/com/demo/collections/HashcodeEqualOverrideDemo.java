package com.demo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee {

	private String name;
	private int phoneNo;
	private String emailId;

	public Employee(String name, int phoneNo, String emailId) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;

		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + phoneNo;

		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Employee other = (Employee) obj;

		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;

		if (phoneNo != other.phoneNo)
			return false;

		System.out.println("Name: " + other.name + ", Phone No.: " + other.phoneNo + " already exists!");
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phoneNo=" + phoneNo + ", emailId=" + emailId + "]";
	}
}

class SortByEmailId implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmailId().compareTo(o2.getEmailId());
	}
}

public class HashcodeEqualOverrideDemo {

	public static void main(String[] args) throws InterruptedException {

		Employee e1 = new Employee("Siddharth", 123456, "abc1988@gmail.com");
		Employee e2 = new Employee("Siddharth1", 23456, "siddharthsahu@gmail.com");
		Employee e3 = new Employee("Sangita", 423456, "sangitasahu@gmail.com");
		Employee e4 = new Employee("Sangita", 423456, "sangitasahu1988@gmail.com");

		Set<Employee> hs = new HashSet<>();

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);

		System.out.println("\n---------Printing using Iterator---------");
		Iterator<Employee> itr = hs.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("\n---------Printing using lambda expression---------");
		hs.forEach(e -> System.out.println(e));

		ArrayList<Employee> al = new ArrayList<>(hs);

		Collections.sort(al, new SortByEmailId());

		System.out.println("\n---------Sorting by email id---------");
		al.forEach(System.out::println);
	}

}
