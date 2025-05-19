package com.demo.datastructure;

final class LinkedList {
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private int size = 0;
	private Node head;

	public LinkedList() {
		head = null;
	}

	public LinkedList(int data) {
		head = new Node(data);
		size++;
	}

	public int size() {
		return size;
	}

	public void add(int data) {
		if (head == null)
			head = new Node(data);

		else {
			Node lastNode = head;

			while (lastNode.next != null)
				lastNode = lastNode.next;

			lastNode.next = new Node(data);
		}

		size++;
	}

	public int get(int index) {
		if (index < 0 || index > size - 1)
			return -1;
		else {
			Node currNode = head;

			for (int i = 0; i < index; i++) {
				currNode = currNode.next;
			}

			return currNode.data;
		}
	}
}

public class LinkedListAddGetImpl {

	public static void main(String[] args) {

		LinkedList llist = new LinkedList();
		llist.add(10);
		llist.add(30);
		llist.add(50);
		llist.add(70);
		llist.add(90);
		llist.add(110);

		System.out.println("Size of Linkedlist: " + llist.size());
		System.out.println(llist.get(0));
		System.out.println(llist.get(1));
		System.out.println(llist.get(5));
		System.out.println(llist.get(6));
	}

}
