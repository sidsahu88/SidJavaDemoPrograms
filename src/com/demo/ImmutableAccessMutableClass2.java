package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ImmutableKlass2 {

	private final List<MutableKlass2> mutlist;

	public ImmutableKlass2(List<MutableKlass2> mutlist) {
		this.mutlist = new ArrayList<>();

		Iterator<MutableKlass2> itr = mutlist.iterator();

		MutableKlass2 temp;

		while (itr.hasNext()) {

			temp = new MutableKlass2();

			temp.setData(itr.next().getData());

			this.mutlist.add(temp);
		}

	}

	public List<MutableKlass2> getMutlist() {
		return new ArrayList<>(mutlist);
	}

}

class MutableKlass2 {

	int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "MutableKlass2 [data=" + data + "]";
	}

}

public class ImmutableAccessMutableClass2 {

	public static void main(String[] args) {
		MutableKlass2 mk1 = new MutableKlass2();
		mk1.setData(10);

		MutableKlass2 mk2 = new MutableKlass2();
		mk2.setData(20);

		MutableKlass2 mk3 = new MutableKlass2();
		mk3.setData(100);

		List<MutableKlass2> list = new ArrayList<>();

		list.add(mk1);
		list.add(mk2);

		ImmutableKlass2 ik = new ImmutableKlass2(list);

		System.out.println(ik.getMutlist());
		System.out.println("\nChanging data to 1000 in second element of the list...");

		mk2.setData(1000);

		System.out.println(ik.getMutlist());
		System.out.println("\nAdding third element to the list...");

		ik.getMutlist().add(mk3);

		System.out.println(ik.getMutlist());
	}

}
