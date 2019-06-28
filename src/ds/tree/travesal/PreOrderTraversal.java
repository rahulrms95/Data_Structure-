package ds.tree.travesal;

import ds.tree.pojo.TreeNode;

public class PreOrderTraversal implements Traversal<Integer>{

	@Override
	public void traversal(TreeNode<Integer> treeNode) {
		// TODO Auto-generated method stub

		if(treeNode == null)
		{
			return;
		}
		
		System.out.print(treeNode.getValue()+" ");
		traversal(treeNode.left);
		traversal(treeNode.right);
	 
	}
}
