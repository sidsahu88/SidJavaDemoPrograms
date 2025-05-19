package com.demo;

public class StringFormatDemo {
	public static void main(String[] args) {
		System.out.println(String.format("Hi %s, how are you? Your marks is %d.", "Sangita", 200));

		String token = "eKIGmGxM05WxVBpIXuMONCZT/pwi0VIw_IBM_5";

		if (token.indexOf("_IBM_") != -1) {
			token = token.substring(0, token.indexOf("_IBM_"));
		}

		System.out.println(token);
	}
}
