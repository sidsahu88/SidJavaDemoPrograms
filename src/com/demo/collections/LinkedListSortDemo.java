package com.demo.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListSortDemo {

	public static void main(String[] args) {

		LinkedList<Integer> ls = new LinkedList<>();

		ls.add(10);
		ls.add(5);
		ls.add(20);
		ls.add(15);

		System.out.println("Elements: " + ls);

		Collections.sort(ls);

		System.out.println("Sorting: " + ls);

		Collections.sort(ls, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				//return o2.compareTo(o1);
				return o2 - o1;
			}

		});

		System.out.println("Sorting in reverse order: " + ls);
	}

}
