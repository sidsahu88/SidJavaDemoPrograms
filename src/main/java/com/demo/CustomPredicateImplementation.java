package com.demo;

import java.util.function.Predicate;

public class CustomPredicateImplementation {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> isGreaterThan10 = num -> num > 10;

        Predicate<Integer> isEvenAndGreaterThan10 = isEven.and(isGreaterThan10);
        Predicate<Integer> isEvenOrGreaterThan10 = isEven.or(isGreaterThan10);

        System.out.println("15 is Even? " + isEven.test(15));
        System.out.println("20 is Even? " + isEven.test(20));
        System.out.println("12 is Even and Greater than 10 ? " + isEvenAndGreaterThan10.test(12));
        System.out.println("13 is Even and Greater than 10 ? " + isEvenAndGreaterThan10.test(13));
        System.out.println("13 is Even or Greater than 10 ? " + isEvenOrGreaterThan10.test(13));
        System.out.println("7 is Even or Greater than 10 ? " + isEvenOrGreaterThan10.test(7));
    }
}
