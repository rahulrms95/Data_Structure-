package ds.tree.bst;

import ds.tree.pojo.TreeNode;

public class BSTUtility {

	TreeNode<Integer> root;
	
	public BSTUtility() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	public static void main(String[] args) {
		
	}
	
	public TreeNode<Integer> createBST(int arr[])
	{
		if(arr != null && arr.length>0 && root == null)
		{
			root = new TreeNode<Integer>(arr[0]);
		}
		
		return root;
	}
}
