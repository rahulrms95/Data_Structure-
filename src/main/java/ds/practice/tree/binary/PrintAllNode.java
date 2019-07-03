package ds.practice.tree.binary;

import ds.practice.tree.pojo.TreeNode;
import ds.practice.tree.utility.TreeUtility;

public class PrintAllNode {

	public void printRecursive(TreeNode<?> root)
	{
		if(root == null)
		{
			return;
		}

		System.out.print(root.getValue()+" ");
		printRecursive(root.left);
		printRecursive(root.right);
	}

	public static void main(String[] args) {

		int arr[] = {3,4,5,6,7,23,12};
		TreeNode<Integer> root = null;
		root = (TreeNode<Integer>) TreeUtility.createTree(arr, 0, root);
		TreeUtility.print(root);
		

	}
}
