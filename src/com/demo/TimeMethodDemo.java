package com.demo;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class TimeMethodDemo {

	public static void main(String[] args) throws InterruptedException {
		long startTime = System.currentTimeMillis();
		long diff;

		TimeUnit tu = TimeUnit.SECONDS;

		System.out.println("Start Time: " + startTime);

		Thread.sleep(5000);

		diff = System.currentTimeMillis() - startTime;

		System.out.println("Diff in Millisecs: " + diff);

		System.out.println("Diff in secs: " + tu.convert(diff, TimeUnit.MILLISECONDS));
		
		System.out.println(UUID.randomUUID().toString());
	}

}
