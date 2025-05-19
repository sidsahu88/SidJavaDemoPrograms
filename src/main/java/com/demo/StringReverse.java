package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a String: ");
        String input = reader.readLine();
        reader.close();
        StringBuilder output = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--)
            output.append(input.charAt(i));

        System.out.println("Reversed String: \n" + output);
    }

}
