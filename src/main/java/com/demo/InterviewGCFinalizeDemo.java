package com.demo;

public class InterviewGCFinalizeDemo {

	public static void main(String[] args) throws InterruptedException {

		String str = "abc";

		str = null;

//		InterviewGCFinalizeDemo igf = new InterviewGCFinalizeDemo();
		
//		igf = null;

		System.gc();

		Thread.sleep(5000);

		System.out.println("end of main method ");

	}

	/*
	 * This finalize method will be called if object of InterviewGCFinalizeDemo get
	 * nullify. But, not for the String.
	 */

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}

}
