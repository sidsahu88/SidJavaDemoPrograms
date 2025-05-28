package com.demo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StringDeleteOtherStringDemo {

    public static void main(String[] args) {

        String str1 = "bangalore";
        String str2 = "bc";

        System.out.println("Op1: " + getTrimmedString(str1, str2) + "\nOp2: " + getTrimmedString(str2, str1));

    }

    public static String getTrimmedString(String str, String trimStr) {
        Set<Character> trimStrSet = new HashSet<>();

        for (char ch: trimStr.toCharArray())
            trimStrSet.add(ch);

        StringBuilder trimmedStr = new StringBuilder();

        for (char ch: str.toCharArray()) {
            if (trimStrSet.contains(ch))
                continue;

            trimmedStr.append(ch);
        }

        return trimmedStr.toString();
    }
}