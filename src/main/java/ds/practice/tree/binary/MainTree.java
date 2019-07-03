package ds.practice.tree.binary;

import ds.practice.tree.pojo.TreeNode;

public class MainTree {

	
	public static void main(String[] args) {
		
		TreeNode<Integer> root = new TreeNode<Integer>(5);
		TreeNode<Integer> left1 = root.left = new TreeNode<Integer>(6);
		TreeNode<Integer> right1 = root.right = new TreeNode<Integer>(7);
		TreeNode<Integer> left2 = left1.left = new TreeNode<Integer>(12);
		TreeNode<Integer> right2 ;
		
		LCA lca = new LCA();
		
		lca.getLCA(root);
		
	}
}
