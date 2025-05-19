package com.demo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Worker {

	private int id;
	private String name;
	private int age;
	private double salary;

	Worker() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}

public class JSONSerialisation {

	private static void writeToJSON(Worker worker) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		mapper.writeValue(new File("workerstate.json"), worker);
	}

	private static Worker readFromJSON() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		return mapper.readValue(new File("workerstate.json"), Worker.class);
	}

	public static void main(String[] args) {

		Worker w1 = new Worker();

		w1.setId(12345);
		w1.setName("Siddharth Sahu");
		w1.setAge(31);
		w1.setSalary(2500000);

		System.out.println("Worker Object 1: " + w1);

		try {
			writeToJSON(w1);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Worker w2 = readFromJSON();
			System.out.println("Worker Object 2: " + w2);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
