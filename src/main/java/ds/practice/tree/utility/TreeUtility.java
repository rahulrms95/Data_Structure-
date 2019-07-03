package ds.practice.tree.utility;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import ds.practice.tree.pojo.TreeNode;

public class TreeUtility<K> {

	TreeNode<K> root;
	TreeNode<K> left ;
	TreeNode<K> right;
	Queue<TreeNode<K>> que ;
	public TreeUtility() {
		// TODO Auto-generated constructor stub
		this.root = null;
		this.left = null;
		this.right = null;
		this.que = new LinkedList<>();
	}


	/* to print given tree 
	 * preoder traversal */
	public void printPreorder(TreeNode<K> root)
	{
		if(root == null)
		{
			//System.out.println();
			return;
		}
		else
		{

			System.out.print(root.getValue()+"->");
			printPreorder(root.left);
			printPreorder(root.right);
		}
	}


	/* to print given tree 
	 * inoder traversal */
	public void printInorder(TreeNode<K> root)
	{
		if(root == null)
		{
			//System.out.println();
			return;
		}
		else
		{

			printInorder(root.left);
			System.out.print(root.getValue()+"->");
			printInorder(root.right);
		}
	}


	/* to print given tree 
	 * postoder traversal */
	public void printPostorder(TreeNode<K> root)
	{
		if(root == null)
		{
			//System.out.println();
			return;
		}
		else
		{
			printPostorder(root.left);
			printPostorder(root.right);
			System.out.print(root.getValue()+"->");
		}
	}

	/* If user passing argument as array 
	 * to create complete binary tree */
	public TreeNode<K> createTree(K arr[])
	{

		if(arr != null && arr.length > 0)
		{
			int i = 0;

			root = new TreeNode<K>(arr[i]);
			i++;
			que.add(root);
			TreeNode<K> currentNode;
			while(!que.isEmpty())
			{
				currentNode = que.remove();
				if(i<arr.length)
				{
					currentNode.left = new TreeNode<K>(arr[i]);
					i++;
					que.add(currentNode.left);
				}

				if(i<arr.length)
				{
					currentNode.right = new TreeNode<K>(arr[i]);
					i++;
					que.add(currentNode.right);
				}
			}

		}
		return root;
	}

	/* if user passing argument as List */
	public TreeNode<K> createTree(List<K> arr)
	{
		if(arr != null && arr.size() > 0)
		{

		}
		return root;
	}

	public static TreeNode<?> createTree(int arr[],int i,TreeNode<?> root)
	{
		if(root == null)
		{
			root = new TreeNode<Integer>(arr[i]);
		}
		else
		{
			createTree(arr,i+1,root.left);
			createTree(arr, i+2, root.right);
		}

		return root;
	}
	
	public static void print(TreeNode<?> root)
	{
		if(root == null)
		{
			return ;
		}
		
		System.out.print(root.getValue()+" ");
		print(root.left);
		print(root.right);
		
	}
}
