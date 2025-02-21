package com.demo.datastructure;

import java.util.LinkedList;
import java.util.Queue;

final class BSTNode {

	public int data;
	public BSTNode left, right;

	public BSTNode(int data) {

		this.data = data;
		left = null;
		right = null;
	}
}

class BST {

	public BSTNode root;

	public BST() {
		root = null;
	}

	public void insert(int data) {
		root = insertBSTNode(root, data);
	}

	public BSTNode insertBSTNode(BSTNode root, int data) {

		if (root == null) {
			root = new BSTNode(data);
			return root;
		}

		if (data <= root.data) {
			root.left = insertBSTNode(root.left, data);
		} else if (root.data < data) {
			root.right = insertBSTNode(root.right, data);
		}

		return root;
	}

	public void delete(int data) {
		root = deleteBSTNode(root, data);
	}

	public BSTNode deleteBSTNode(BSTNode root, int data) {

		if (data < root.data) {
			root.left = deleteBSTNode(root.left, data);
		} else if (root.data < data) {
			root.right = deleteBSTNode(root.right, data);
		} else if (data == root.data) {
			//Case 1: If a leaf node
			if (root.left == null && root.right == null) {
				root = null;
			}
			//Case 2: If node has 1 child
			else if (root.left == null && root.right != null) {
				BSTNode temp = root.right;
				root = null;
				root = temp;
			}
			else if (root.left != null && root.right == null) {
				BSTNode temp = root.left;
				root = null;
				root = temp;
			}
			//Case 3: If node has 2 childs
			else if (root.left != null && root.right != null) {
				BSTNode temp = root;
				root.data = findMin(temp.right);
				root.right = deleteBSTNode(temp.right, temp.data);
			}
		}

		return root;
	}
	
	public void inorder() {
		inorderTraverse(root);
	}

	public void inorderTraverse(BSTNode root) {

		if (root != null) {
			inorderTraverse(root.left);
			System.out.println(root.data);
			inorderTraverse(root.right);
		}
	}

	public void preorder() {
		preorderTraverse(root);
	}

	public void preorderTraverse(BSTNode root) {

		if (root != null) {
			System.out.println(root.data);
			preorderTraverse(root.left);
			preorderTraverse(root.right);
		}
	}

	public void postorder() {
		postorderTraverse(root);
	}

	public void postorderTraverse(BSTNode root) {

		if (root != null) {
			postorderTraverse(root.left);
			postorderTraverse(root.right);
			System.out.println(root.data);
		}
	}

	public void levelOrder() {
		levelOrderTraverse(root);
	}

	public void levelOrderTraverse(BSTNode root) {

		if (root != null) {
			Queue<BSTNode> q = new LinkedList<>();

			q.add(root);

			while (!q.isEmpty()) {
				BSTNode current = q.poll();

				System.out.println(current.data);

				if (current.left != null)
					q.add(current.left);

				if (current.right != null)
					q.add(current.right);
			}
		}
	}

	public int findMin() {
		return findMin(root);
	}

	public int findMin(BSTNode root) {

		if (root != null) {

			if (root.left == null) {
				return root.data;
			} else {
				return findMin(root.left);
			}

		}

		return -1;
	}

	public int findMax() {
		return findMax(root);
	}

	public int findMax(BSTNode root) {

		if (root != null) {

			while (root.right != null) {
				root = root.right;
			}

			return root.data;
		}
		return -1;

	}

	public int findHeight() {
		return findHeight(root);
	}

	public int findHeight(BSTNode root) {
		if (root == null) {
			return -1;
		}

		return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
	}
	
	public boolean isBST(BSTNode root, int min, int max) {
		
		if(root == null)
			return true;
		
		if (root.data < min || root.data > max)
   			return false;

		return (isBST(root.left, min, root.data) && isBST(root.right, root.data, max));
	}
}

public class BSTDemo {

	public static void main(String[] args) {

		BST bst = new BST();

		bst.insert(50);
		bst.insert(60);
		bst.insert(30);
		bst.insert(20);
		bst.insert(40);
		bst.insert(10);
		bst.insert(35);
		bst.insert(45);
		bst.insert(90);
		bst.insert(100);
		bst.insert(70);

		System.out.println("Min data: " + bst.findMin());
		System.out.println("Max data: " + bst.findMax());

		System.out.println("Height of tree: " + bst.findHeight());
		
		System.out.println("If tree is Binary Search Tree? "+ bst.isBST(bst.root, bst.findMin(), bst.findMax()));
		
		System.out.println("Inorder: ");
		bst.inorder();

		System.out.println("Preorder: ");
		bst.preorder();

		System.out.println("Postorder: ");
		bst.postorder();

		System.out.println("levelorder: ");
		bst.levelOrder();
		
		System.out.println("Deleting a leaf node: 10...");
		bst.delete(10);
		
		System.out.println("After deleting, tree inorder: ");
		bst.inorder();
		
		System.out.println("After deleting, tree preorder: ");
		bst.preorder();
		
		System.out.println("Deleting a node: 60 with 1 child...");
		bst.delete(60);
		
		System.out.println("After deleting, tree inorder: ");
		bst.inorder();
		
		System.out.println("After deleting, tree preorder: ");
		bst.preorder();
		
		System.out.println("Deleting a node: 30 with 2 child...");
		bst.delete(30);
		
		System.out.println("After deleting, tree inorder: ");
		bst.inorder();
		
		System.out.println("After deleting, tree preorder: ");
		bst.preorder();
	}

}
