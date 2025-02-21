package com.demo.datastructure;

public class ReverseLinkedList {

	public static void main(String[] args) {

		MyLinkedList ll = new MyLinkedList("Alpha");
		ll.addLLNodeLast("Bravo");
		ll.addLLNodeLast("Charlie");
		ll.addLLNodeLast("Delta");
		ll.addLLNodeLast("Foxtrot");

		System.out.println("Linked list is: ");
		ll.displayLL();

		System.out.println("\nReversing the list...");
		ll.reverseLL();

		System.out.println("\nLinked list after reversing: ");
		ll.displayLL();

		System.out.println("\nPrinting linked list in reverse order: ");
		ll.printLLReverseRecursion(ll.head);

		System.out.println("\nReversing the list using recursion...");
		ll.reverseLLRecurse(ll.head);

		System.out.println("\nLinked list after reversing: ");
		ll.displayLL();

	}
}
