package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SingleValueClass<T> {

	T obj;

	public SingleValueClass(T obj) {
		super();
		this.obj = obj;
	}

	public T getObject() {
		return obj;
	}

}

public class SingleMethodReturnMultipleObjects2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		Map<Integer, String> map = new HashMap<Integer, String>();

		list.add("Iron Man");
		list.add("Spiderman");
		list.add("Hawkeye");
		list.add("Thor");

		map.put(1, "Black Panther");
		map.put(2, "Captain America");
		map.put(3, "Captain Marvel");

		SingleValueClass<List<String>> svcList = new SingleValueClass<List<String>>(list);
		SingleValueClass<Map<Integer, String>> svcMap = new SingleValueClass<Map<Integer, String>>(map);

		System.out.println("List: " + svcList.getObject());
		System.out.println();
		System.out.println("Map: " + svcMap.getObject());
	
	}
}
