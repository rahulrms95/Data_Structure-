package com.interview.questions;

import ds.practice.tree.bst.BSTUtility;

public class BSTDeletion {

	private class Node
	{
		Node left;
		Node right;
		int data;
		
		public Node(int val)
		{
			this.data = val;
			this.left = null;
			this.right = null;
		}
	}
	
	public static void main(String[] args) {
		
		BSTDeletion bst = new BSTDeletion();
		Node root = bst.new Node(12);
		root.left = bst.new Node(8);
		root.right = bst.new Node(18);
		
		print(root);
	}
	
	static void print(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.data+" ");
		print(root.left);
		print(root.right);
		System.out.println();
	}
	
}
