package com.demo;

import java.lang.reflect.Field;
import java.util.stream.Stream;

class UserProfile {

	private String userId;
	private String email;
	private String firstName;
	private String lastName;

	public UserProfile() {
	}

	public UserProfile(String userId, String email, String firstName, String lastName) {
		this.userId = userId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}

public class ClassFieldDemo {

	public static void main(String[] args) {
		UserProfile userProfile = new UserProfile();

		Field[] fields = userProfile.getClass().getDeclaredFields();
		String[] sfields = Stream.of(fields).map(Field::getName).toArray(String[]::new);

		Stream.of(sfields).forEach(System.out::println);
	}
}
