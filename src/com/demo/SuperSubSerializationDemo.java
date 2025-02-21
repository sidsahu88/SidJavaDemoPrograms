package com.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerialSuperClass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int i;

	public SerialSuperClass(int i) {
		this.i = i;
	}

}

class SerialSubClass extends SerialSuperClass {

	int j;

	public SerialSubClass(int i, int j) {
		super(i);
		this.j = j;
	}

	private void writeObject(ObjectOutputStream out) throws IOException {
		throw new NotSerializableException();
	}

	private void readObject(ObjectInputStream out) throws IOException {
		throw new NotSerializableException();
	}

}

public class SuperSubSerializationDemo {

	public static void main(String[] args) throws Exception {

		SerialSuperClass sup = new SerialSuperClass(50);

		System.out.println("Super Class before serialization: i = " + sup.i);

		FileOutputStream fout = new FileOutputStream("SupSerial.ser");
		ObjectOutputStream objout = new ObjectOutputStream(fout);

		objout.writeObject(sup); // Serializing the class

		objout.close();
		fout.close();

		FileInputStream fin = new FileInputStream("SupSerial.ser");
		ObjectInputStream objin = new ObjectInputStream(fin);

		SerialSuperClass sup2 = (SerialSuperClass) objin.readObject(); // Deserializing the class

		System.out.println("Super Class after deserialization: i = " + sup2.i);

		SerialSubClass sub = new SerialSubClass(10, 20);

		System.out.println("Sub Class before serialization: i = " + sub.i + ", j = " + sub.j);

		FileOutputStream fout2 = new FileOutputStream("SubSerial.ser");
		ObjectOutputStream objout2 = new ObjectOutputStream(fout2);

		objout2.writeObject(sub); // Serializing the class

		objout.close();
		fout.close();

		FileInputStream fin2 = new FileInputStream("SubSerial.ser");
		ObjectInputStream objin2 = new ObjectInputStream(fin2);

		SerialSubClass sub2 = (SerialSubClass) objin2.readObject(); // Deserializing the class

		System.out.println("Sub Class after deserialization: i = " + sub2.i + ", j = " + sub2.j);

	}

}
