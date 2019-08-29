package ds.practice.tree.bst;

import ds.practice.tree.pojo.TreeNode;

public class BSTUtility {

	public BSTUtility() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

	}

	/**
	 * To Create Binary Search Tree for given array input
	 * 
	 * **/
	public static TreeNode<Integer> createBST(TreeNode<Integer> root ,int arr[],int index)
	{
		if(root == null)
		{
			root = new TreeNode<Integer>(arr[index]);
			index = index+1;
		}
		if(index< arr.length && root.getValue() > arr[index])
		{
			root.left = createBST(root, arr,index+1);
		}
		else if(index< arr.length)
		{
			root.right = createBST(root, arr,index+1);
		}
		return root;
	}
	
	
}
