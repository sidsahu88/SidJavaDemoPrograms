package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StringReverseUsingRecursion {

	public static void main(String[] args) {
		
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Enter a String: ");
			String input = reader.readLine();
			System.out.println("Reversed String: \n" + reverseString(input));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}
	
	private static String reverseString(String str) {
		String reverseStr = "";
		
		if (str.length() > 1)				
			reverseStr = reverseString(str.substring(1)) + str.charAt(0);
		else if(str.length() == 1)
			reverseStr = str;
				
		return reverseStr;
	}

}
