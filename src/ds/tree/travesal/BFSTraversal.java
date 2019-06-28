package ds.tree.travesal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import ds.tree.pojo.TreeNode;
import ds.tree.utility.TreeUtility;

public class BFSTraversal {
	TreeNode<Integer> root;
	public BFSTraversal()
	{
		this.root = null;
	}
	
	public void printBFSUsingStack(TreeNode<Integer> node)
	{
		Queue<TreeNode<Integer>> queue = new LinkedList<>();

		queue.add(node);
		TreeNode<Integer> tempNode;  // = node;
		while(!queue.isEmpty())
		{
			tempNode = queue.remove();
			if(tempNode.getValue() == -1)
			{
				System.out.println();
			}
			System.out.print(tempNode.getValue()+" ");
			if(tempNode.left != null)
			{
				queue.add(tempNode.left);
			}
			if(tempNode.right != null)
			{
				queue.add(tempNode.right);
			}
		}
	}
	
	public static void main(String[] args) {

		BFSTraversal b = new BFSTraversal();

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
		b.printBFSUsingStack(root);


	}

	public void BFSTraversal(TreeNode node)
	{
		Queue<TreeNode> q = new LinkedList<>();
		q.add(node);
		TreeNode currentNode ;
		System.out.println("BFS TRAVERSAL ");
		TreeNode neg = new TreeNode(-1);
		q.add(neg);
		Integer v = new Integer(1);
		while(!q.isEmpty())
		{
			currentNode = q.remove();

			if(currentNode != null)
			{
				if(currentNode.getValue().toString().equalsIgnoreCase("-1") && !q.isEmpty())
				{
					System.out.println();
					q.add(neg);
				}
				else
				{
					if(!currentNode.getValue().toString().equalsIgnoreCase("-1"))
					System.out.print(currentNode.getValue()+" ");
					q.add(currentNode.left);
					q.add(currentNode.right);
					
				}
			}

		}
	}

}
