package com.demo.datastructure;

final class MyLinkedList {

	private class Node {

		public String name;
		public Node next;

		public Node(String name) {

			this.name = name;

		}

		public Node(String name, Node next) {

			this(name);
			this.next = next;

		}
	}

	public Node head;

	public MyLinkedList() {

		head = null;

	}

	public MyLinkedList(String name) {

		head = new Node(name, null);

	}

	public void addLLNodeLast(String name) {

		Node newNode = new Node(name, null);

		if (head == null)
			head = newNode;
		else {
			Node prevNode = head;

			while (prevNode.next != null)
				prevNode = prevNode.next;

			prevNode.next = newNode;
		}
	}

	public void addLLNodeFirst(String name) {

		Node newNode = new Node(name, null);

		if (head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void addLLNodeAt(int pos, String name) {

		Node newNode = new Node(name, null);
		Node currNode = head;
		Node prevNode = null;

		if (head == null)
			System.out.println("Position not found.");
		else if (pos == 1) {
			newNode.next = currNode;
			head = newNode;
		} else {
			int currPos = 1;

			while (currPos != pos && currNode.next != null) {
				prevNode = currNode;
				currNode = currNode.next;
				currPos++;
			}

			if (currNode == null || currNode.next == null)
				System.out.println("Position not found.");
			else {
				prevNode.next = newNode;
				newNode.next = currNode;
			}
		}
	}

	public void deleteLLNodeLast() {

		if (head == null)
			System.out.println("No node available to delete");
		else {
			if (head.next == null) {
				head = null;
				return;
			}

			Node currNode = head;
			Node nextNode = currNode.next;

			while (nextNode.next != null) {
				currNode = nextNode;
				nextNode = nextNode.next;
			}

			currNode.next = null;
		}
	}

	public void deleteLLNodeFirst() {

		if (head == null)
			System.out.println("No node available to delete");
		else {
			if (head.next == null) {
				head = null;
				return;
			}

			Node nextNode = head.next;
			head.next = null;
			head = nextNode;
		}
	}

	public void deleteLLNodeAt(int pos) {

		Node currNode = head;
		Node prevNode = null;

		if (head == null)
			System.out.println("Position not found.");
		else if (pos == 1) {
			currNode = currNode.next;
			head = currNode;
		} else {
			int currPos = 1;

			while (currPos != pos && currNode.next != null) {
				prevNode = currNode;
				currNode = currNode.next;
				currPos++;
			}

			if (currNode == null || currNode.next == null)
				System.out.println("Position not found.");
			else
				prevNode.next = currNode.next;
		}
	}

	public void reverseLL() {

		if (head == null)
			System.out.println("No Linked List available to reverse.");
		else {
			Node currNode = head;
			Node nextNode = null;
			Node prevNode = null;

			while (currNode != null) {

				nextNode = currNode.next;
				currNode.next = prevNode;
				prevNode = currNode;
				currNode = nextNode;

			}

			head = prevNode;
		}

	}

	public void reverseLLRecurse(Node currNode) {

		if (currNode.next == null) {
			head = currNode;
			return;
		} else {
			reverseLLRecurse(currNode.next);
			Node prevNode = currNode.next;
			prevNode.next = currNode;
			currNode.next = null;

		}

	}

	public void printLLReverseRecursion(Node head) {

		if (head != null) {
			printLLReverseRecursion(head.next);
			System.out.println(head.name);
		} else
			return;
	}

	public void displayLL() {

		Node currNode = head;
		while (currNode != null) {
			System.out.println(currNode.name);
			currNode = currNode.next;

		}
	}
}

public class LinkedListDemo {

	public static void main(String[] args) {
		MyLinkedList l1 = new MyLinkedList();

		l1.addLLNodeLast("Siddharth");
		l1.addLLNodeLast("Sangita");
		l1.addLLNodeLast("Srimant");
		l1.addLLNodeFirst("Prafulla");
		l1.addLLNodeAt(2, "Minakshi");

		System.out.println("1st Linked List: ");
		l1.displayLL();

		System.out.println("\nDeleting elements...");
		l1.deleteLLNodeLast();
		l1.deleteLLNodeFirst();

		System.out.println("\n1st Linked List after deletion: ");
		l1.displayLL();

		MyLinkedList l2 = new MyLinkedList("Guddu");

		l2.addLLNodeLast("Siddi");
		l2.addLLNodeLast("Chotu");
		l2.addLLNodeFirst("Murali");
		l2.addLLNodeAt(1, "Kanha");

		System.out.println("\n2nd Linked List: ");
		l2.displayLL();

		System.out.println("\nDeleting elements...");

		l2.deleteLLNodeAt(6);

		System.out.println("\n2nd Linked List after deletion: ");
		l2.displayLL();
	}
}