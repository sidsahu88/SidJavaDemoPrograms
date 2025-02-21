package com.demo.datastructure;

final class BinarySearchTree extends BST {

	BinarySearchTree() {
		new BST();
	}

	BinarySearchTree(int data) {
		insert(data);
	}

	public void BSTInsert(int data) {
		insert(data);
	}

	public int FindSuccessor(int data) {
		BSTNode currNode = root;
		BSTNode ancestor = null;

		while (currNode != null) {
			if (data < currNode.data) {
				ancestor = currNode;
				currNode = currNode.left;
			} else if (currNode.data < data)
				currNode = currNode.right;
			else if (currNode.data == data)
				break;
		}
		
		if (currNode.right != null)
			return findMin(currNode.right);
		else if (currNode.right == null && ancestor != null)
			return ancestor.data;
		else
			return -1;
			
	}
}

public class BSTNodeSuccessor {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		tree.BSTInsert(50);
		tree.BSTInsert(60);
		tree.BSTInsert(30);
		tree.BSTInsert(20);
		tree.BSTInsert(40);
		tree.BSTInsert(10);
		tree.BSTInsert(35);
		tree.BSTInsert(45);
		tree.BSTInsert(90);
		tree.BSTInsert(100);
		tree.BSTInsert(70);

		System.out.println("Inorder: ");
		tree.inorder();

		System.out.println("Successor of 60 is " + tree.FindSuccessor(60));
		System.out.println("Successor of 50 is " + tree.FindSuccessor(50));
		System.out.println("Successor of 20 is " + tree.FindSuccessor(20));
		System.out.println("Successor of 45 is " + tree.FindSuccessor(45));
		System.out.println("Successor of 100 is " + tree.FindSuccessor(100));
	}

}
