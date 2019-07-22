package ds.practice.tree.bst;

import ds.practice.tree.pojo.TreeNode;

public class BSTSearch {

	public int search(TreeNode<Integer> root, int value)
	{
		if(root == null)
		{
			return -1;
		}
		if(root.getValue() == value)
		{
			return value;
		}
		else if(root.getValue() > value)
		{
			return search(root.left, value);
		}
		else
		{
			return search(root.right, value);
		}
	}
}
