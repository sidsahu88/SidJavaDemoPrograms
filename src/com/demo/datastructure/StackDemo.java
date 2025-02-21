package com.demo.datastructure;

class Stack {

	private String[] stackArray;
	private int maxSize;
	public int top = -1;

	public Stack(int stackSize) {

		maxSize = stackSize;
		stackArray = new String[maxSize];

	}

	public void push(String name) {

		if (top == maxSize - 1) {
			System.out.println("Stack is full.");
			return;
		}

		stackArray[++top] = name;

		System.out.println("Added " + stackArray[top]);

	}

	public void pop() {

		if (top == -1) {
			System.out.println("Stack is empty.");
			return;
		}

		System.out.println("Removing " + stackArray[top--]);
	}

}

public class StackDemo {

	public static void main(String[] args) {

		Stack st = new Stack(4);

		System.out.println("Pushing elements to stack...");
		st.push("Sid");
		st.push("Git");
		st.push("Dad");
		st.push("Mom");
		st.push("Sri");

		System.out.println("Poping elements from stack..");
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();

	}

}