package com.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class MyClass {
    private int i;
    MyClass(int i) {
        this.i = i;
    }
}

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<MyClass> set = new HashSet<>();
        set.add(new MyClass(10));
        set.add(new MyClass(10));

        System.out.println(set.size());

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");

        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames.size());
    }
}
