package ds.practice.tree.binary;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import ds.practice.tree.pojo.TreeNode;

public class BinayTreeUtililty {


	public TreeNode createBT(List<Integer> lst)
	{
		TreeNode<Integer> root = new TreeNode<Integer>(lst.get(0));
		Queue<TreeNode> queue = new LinkedList<>();
		Stack<TreeNode> st = new Stack<>();
		st.push(root);
		queue.add(root);
		int size = 1;
		while(!queue.isEmpty() && (lst.size())>size)
		{
			TreeNode temp = queue.remove();
			temp.left = new TreeNode<Integer>(lst.get(size));
			queue.add(temp.left);
			size++;
			if(size<lst.size())
			{
				temp.right = new TreeNode<Integer>(lst.get(size));
				queue.add(temp.right);
				size++;
			}
		}
		return root;
	}

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
	
	public boolean isNodeExist(TreeNode<?> root,TreeNode<Integer> node)
	{
		if(root == null)
		{
			return false;
		}
		if(root.getValue() == node.getValue())
		{
			return true;
		}
		return isNodeExist(root.left, node) || isNodeExist(root.right, node);
		
	}
}
