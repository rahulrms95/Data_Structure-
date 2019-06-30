package ds.practice.tree.travesal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import ds.practice.tree.pojo.TreeNode;
import ds.practice.tree.utility.TreeUtility;

public class DFSTraversal {
	
	
	public static void main(String[] args) {


		DFSTraversal b = new DFSTraversal();

		TreeUtility<Integer> utility = new TreeUtility<>();

		List<Integer> lst = new ArrayList<>();
		Integer [] arr = {5,7,10,11,15,17,20};

		TreeNode<Integer> root = utility.createTree(arr);
		/*	System.out.println("Inorder");
		utility.printInorder(root);
		System.out.println();
		System.out.println("PreOrder");
		utility.printPreorder(root);
		System.out.println();
		System.out.println("PostOrder")*/;
		//utility.printPostorder(root);

		System.out.println();

		//b.BFSTraversal(root);
		b.DFSTraversalUsingStack(root);


	
	}

	public void DFSTraversalUsingStack(TreeNode<Integer> treeNode)
	{
		Stack<TreeNode<Integer>> stack = new Stack<>();
		
		stack.push(treeNode);
		
		while(!stack.isEmpty())
		{
			TreeNode<Integer> tempNode = stack.pop();
			
			System.out.print(tempNode.getValue()+" ");
			if(tempNode.right != null)
			{
				stack.push(tempNode.right);
			}
			if(tempNode.left != null)
			{
				stack.push(tempNode.left);
			}
			
		}
	}
}
