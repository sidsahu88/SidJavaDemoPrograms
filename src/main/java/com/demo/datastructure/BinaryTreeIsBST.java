package com.demo.datastructure;

public class BinaryTreeIsBST {

	public static void main(String[] args) {
		
		BST tree = new BST();
		
		tree.insert(20);
		tree.insert(10);
		tree.insert(15);
		tree.insert(30);
		tree.insert(35);
		tree.insert(22);
		tree.insert(8);
		tree.insert(33);
		tree.insert(5);
		
		System.out.println("If tree is Binary Search Tree? "+ tree.isBST(tree.root, tree.findMin(), tree.findMax()));
	}
}
