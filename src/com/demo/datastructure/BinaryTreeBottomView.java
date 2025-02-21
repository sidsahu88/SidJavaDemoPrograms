package com.demo.datastructure;

import java.util.TreeMap;

public class BinaryTreeBottomView {

	private static TreeMap<Integer, BTNode> map = new TreeMap<>();
	
	public static void main(String[] args) {
		
		BTNode root = new BTNode(10);

		root.left = new BTNode(20);
		root.right = new BTNode(30);
		root.left.right = new BTNode(40);
		root.left.right.right = new BTNode(120);
		root.left.right.right.right = new BTNode(130);
		root.left.right.right.right.right = new BTNode(140);
		root.left.right.right.right.right.right = new BTNode(150);
		root.left.right.left = new BTNode(50);
		root.left.right.left.left = new BTNode(60);
		root.right.left = new BTNode(70);
		root.right.left.left = new BTNode(80);
		root.right.left.right = new BTNode(90);
		root.right.left.right.right = new BTNode(100);
		root.right.left.right.right.right = new BTNode(110);

		getBottomView(root, 0);

		map.values().forEach(System.out::print);

	}
	
	private static void getBottomView(BTNode node, int pos) {
		
		map.put(pos, node);
		
		if (node.left != null)
			getBottomView(node.left, pos - 1);

		if (node.right != null)
			getBottomView(node.right, pos + 1);
	}
}
