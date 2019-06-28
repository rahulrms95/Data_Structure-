package ds.tree.travesal;

import ds.tree.pojo.TreeNode;

public class PostOrderTraversal implements Traversal<Integer>{

	@Override
	public void traversal(TreeNode<Integer> treeNode) {
		// TODO Auto-generated method stub

		if(treeNode == null)
		{
			return;
		}
		traversal(treeNode.left);
		traversal(treeNode.right);
		System.out.print(treeNode.getValue()+" ");
	
	}
}
