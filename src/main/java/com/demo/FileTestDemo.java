package com.demo;

import java.io.*;

public class FileTestDemo {

	public static void main(String[] args) throws IOException 
	{
		/*FileInputStream fi = null;
		FileOutputStream fo = null;*/
		
		FileReader fi = null;
		FileWriter fo = null;
		
		try
		{
			/*fi = new FileInputStream("D:\\eclipse-workspace\\MyDemoProject\\input.txt");
			fo = new FileOutputStream("D:\\eclipse-workspace\\MyDemoProject\\output.txt");*/
			
			fi = new FileReader("D:\\eclipse-workspace\\MyDemoProject\\input.txt");
			fo = new FileWriter("D:\\eclipse-workspace\\MyDemoProject\\output.txt");
			
			int c;
			
			while ((c = fi.read()) != -1)
			{
				fo.write(c);
			}
		}
		finally
		{
			fi.close();
			fo.close();
		}
		
	}

}
