package ds.practice.tree.bst;

import ds.practice.tree.binary.BinayTreeUtililty;
import ds.practice.tree.pojo.TreeNode;

public class MainClass {

	
	public static void main(String[] args) {

		int arr[] = {12,3,7,4,5,8,9};
		BSTUtility bst = new BSTUtility();
		TreeNode<Integer> node = bst.createBST(null, arr, 0);
		new BinayTreeUtililty().printRecursive(node);
		
	}
	
	public void print(Node root)
	{
		if(root == null)
		{
			return;
		}
		else
		{
			System.out.println(root.val);
			print(root.left);
			print(root.right);
		}
	}
}







