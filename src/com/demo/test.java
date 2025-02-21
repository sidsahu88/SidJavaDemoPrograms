package com.demo;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import java.util.Date;

public class test {

	public static String logFilePath = new String("/abcd/xyz/log");
	public static String sourceDate = new String("20180129");

	public static void main(String[] args) {
		System.setProperty("java.util.logging.SimpleFormatter.format", "[%1$tF %1$tT %3$s] :%4$7s: %5$s %n");
		String mainClass = test.class.getName();
		System.out.println(mainClass);

		String testStr = "005879";

		int testInt = Integer.parseInt(testStr + "0");

		System.out.println(testInt);

		String floatstr = String.valueOf((float) (-testInt) / 100);

		System.out.println(floatstr);

		String concatstr = "1234|" + floatstr;

		System.out.println(concatstr);

		/*
		 * String currentDate =
		 * LocalDate.now().format(DateTimeFormatter.ofPattern("YYYYMMDD"));
		 */

		String currentDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));

		String logFile = String.join(File.separator, logFilePath,
				"Hannaford_tender_coupon_file_processing_" + currentDate + ".log");

		System.out.println(currentDate);

		System.out.println(logFile);

		String[] strArr;

		strArr = logFile.split("\\.");

		System.out.println("String 1: " + strArr[0].trim().toUpperCase() + "_PROCESSED\nString 2: "
				+ strArr[1].trim().toUpperCase());

		String outRec = String.join("|", strArr);

		outRec = outRec + "|Great";

		System.out.println(outRec);

		String fileName = new String("POSDATA_FINAL_DELHAIZE_20170901.dat");

		System.out.println(fileName.replaceAll("[^0-9]", ""));

		String empty = new String("No");

		System.out.println("empty string = " + empty);

		empty = "YES";

		System.out.println("empty string = " + empty);

	}

}
