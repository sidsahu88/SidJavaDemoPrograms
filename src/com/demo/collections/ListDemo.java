package com.demo.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("Initial size: " + list.size());
        list = getListData();
        System.out.println("Final size: " + list.size());
        List<String> nullList = null;
        System.out.println(nullList.isEmpty());
        System.out.println(nullList.size() > 0);
    }

    private static List<String> getListData() {
        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("Hello");
        return list;
    }
}
