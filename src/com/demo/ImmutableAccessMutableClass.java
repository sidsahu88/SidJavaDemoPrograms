package com.demo;

import java.util.ArrayList;
import java.util.List;

final class ImmutableKlass {

	private final Integer data;
	private final MutableClass mutableclass;

	public ImmutableKlass(Integer data, MutableClass mutableclass) {
		super();
		this.data = data;

		// If we use this.mutableclass = mutableclass; this will break the immutability
		// of immutable class. So, we need to make a defensive copy in the constructor.
		// Defensive copy or private copy of the class will shields the class from any
		// changes that the caller may make to the original object.

		// this.mutableclass = new MutableClass(this.mutableclass.getData()); //if
		// constructor is parameterized.

		this.mutableclass = new MutableClass(); // if constructor is not parameterized.

		// this.mutableclass.setData(mutableclass.getData());

		List<Integer> list = new ArrayList<>();

		for (Integer temp : mutableclass.getData()) {
			list.add(temp);
		}
		
		this.mutableclass.setData(list);

		// Shallow Cloning to work, you need to override the clone method.
		// this.mutableclass = (MutableClass) mutableclass.clone();
	}

	public Integer getData() {
		return data;
	}

	public MutableClass getMutableclass() /* throws CloneNotSupportedException */ {

		// return new MutableClass(this.mutableclass.getData()); // returning defensive
		// copy or private copy if constructor is parameterized.

		MutableClass newMuObj = new MutableClass(); // if constructor is not parameterized.

		List<Integer> list = new ArrayList<>();

		for (Integer temp : mutableclass.getData()) {
			list.add(temp);
		}
		
		newMuObj.setData(list);

		return newMuObj;

		// Shallow Cloning to work, you need to override the clone method.
		// return (MutableClass) mutableclass.clone();
	}

	@Override
	public String toString() {
		return "ImmutableKlass [data=" + data + ", mutableclass=" + mutableclass + "]";
	}

}

class MutableClass {

	private List<Integer> data;

	public MutableClass() {
	}

	public MutableClass(List<Integer> data) {
		super();
		this.data = data;
	}

	public List<Integer> getData() {
		return data;
	}

	public void setData(List<Integer> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "MutableClass [data=" + data + "]";
	}

}

public class ImmutableAccessMutableClass {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		l.add(10);
		l.add(20);
		l.add(30);

		MutableClass mc = new MutableClass(l);

		ImmutableKlass ic = new ImmutableKlass(15, mc);

		System.out.println("Initial object.");
		System.out.println(ic);
		// System.out.println(ic.getMutableclass());

		l.add(40);

		System.out.println();
		System.out.println("After adding another value to arraylist using l.add(40)");
		System.out.println(ic);
		// System.out.println(ic.getMutableclass());

		ic.getMutableclass().getData().add(1000);

		System.out.println();
		System.out.println("After adding another value to arraylist using ic.getMutableclass().getData().add(1000)");
		System.out.println(ic);
		
		List<Integer> l2 = new ArrayList<>();

		l2.add(100);
		l2.add(200);

		ic.getMutableclass().setData(l2);

		System.out.println();
		System.out.println("After adding new list to mutable class using ic.getMutableclass().setData(l2)");
		System.out.println(ic);
		// System.out.println(ic.getMutableclass());

		mc.setData(l2);

		System.out.println();
		System.out.println("After adding new list to mutable class using mc.setData(l2)");
		System.out.println(ic);

	}

}
