package com.demo;

import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;

public class AccentedCharacterDemo {

	public static void main(String[] args) throws IOException {

		String str = "20 McAlister Placeâ, Ste 110";
		String str2 = "25% OffÂ Select Items - ends 2/15/19-10590506";
		String str3 = "25% Off Select Items - ends 2/15/19-10590506";
		String str4 = "25% Off\u00A0Select Items - ends 2/15/19-10590506";

		System.out.println("String 1: " + str);
		System.out.println("String 2: " + StringUtils.truncate(str2, 40));
		System.out.println("String 3: " + StringUtils.truncate(str3, 40));
		System.out.println("String 4: " + StringUtils.truncate(str4, 40));

		FileWriter fw = new FileWriter("test_file_accented.xml");

		fw.write(str);

		fw.close();
	}

}
