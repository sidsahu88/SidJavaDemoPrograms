package com.demo.datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

final class BTNode {

	public int data;
	public BTNode left, right;

	BTNode(int data) {
		this.data = data;
		left = null;
		right = null;
	}

	@Override
	public String toString() {
		return data + " ";
	}

}

public class BinaryTreeTopView {

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

		getTopView(root);

		map.values().forEach(System.out::print);

	}

	private static void getTopView(BTNode node) {

		class NodePos {
			BTNode node;
			int pos;
			
			NodePos(BTNode node, int pos) {
				this.node = node;
				this.pos = pos;
			}
		}
		
		Queue<NodePos> q = new LinkedList<>();
		
		q.add(new NodePos(node, 0));

		while(!q.isEmpty()) {
			
			NodePos currNP = q.poll();
			
			if (!map.containsKey(currNP.pos))
				map.put(currNP.pos, currNP.node);

			if (currNP.node.left != null)
				q.add(new NodePos(currNP.node.left, currNP.pos - 1));
	
			if (currNP.node.right != null)
				q.add(new NodePos(currNP.node.right, currNP.pos + 1));

		}
	}

}
