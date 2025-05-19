package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SingleMethodClass {

	public final List<String> list;
	public final Map<Integer, String> map;

	public SingleMethodClass(List<String> list, Map<Integer, String> map) {
		super();
		this.list = list;
		this.map = map;
	}

}

public class SingleMethodReturnMultipleObjects {

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

		SingleMethodClass smcList = returnAnyOne(list, null);
		SingleMethodClass smcMap = returnAnyOne(null, map);

		System.out.println("List: " + smcList.list);
		System.out.println();
		System.out.println("Map: " + smcMap.map);
	}

	private static SingleMethodClass returnAnyOne(List<String> list, Map<Integer, String> map) {

		if ((list != null) && (map == null))
			return new SingleMethodClass(list, null);
		else
			return new SingleMethodClass(null, map);

	}

}
