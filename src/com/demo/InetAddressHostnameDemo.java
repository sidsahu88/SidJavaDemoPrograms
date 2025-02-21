package com.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressHostnameDemo {
	public static void main(String[] args) throws UnknownHostException {
		System.out.println(InetAddress.getLocalHost().getHostName());

		int number = 12345;
		String numbString = String.valueOf(number);

		System.out.println(numbString);

		String testTrue1 = "true";
		String testTrue2 = "1";

		System.out.println(Boolean.valueOf(testTrue1));
		System.out.println(Boolean.valueOf(testTrue2));

	}
}
