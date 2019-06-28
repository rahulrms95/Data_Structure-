package ds.tree.bst;

import java.util.ArrayList;
import java.util.List;

import ds.tree.pojo.TreeNode;

public class BSTCreation {

	
	TreeNode<Integer> root;
	public BSTCreation() {
		// TODO Auto-generated constructor stub
		root =null;
	}
	
	/*
    BST from given PreOrder of BST
    */
	
	public TreeNode<Integer> creationBSTFromPreOrder(List<Integer> arr,int start,int end,TreeNode<Integer> node)
	{
		if(arr != null &&!arr.isEmpty() && start<=end)
		{
			node = new TreeNode<Integer>(arr.get(start));
			root = node;
			int pivot =getIndex(arr,arr.get(start),start,end);
			if(pivot >=0)
			{
				root.left = creationBSTFromPreOrder(arr,start+1,pivot-1,node.left);
				root.right = creationBSTFromPreOrder(arr,pivot,end,node.right);
			}
			else
			{
				return node;
			}
		}
		return root;
	}
	
	public int getIndex(List<Integer> lst,Integer num,int start,int end)
	{
		for(int i=start;i<end;i++)
		{
			if(lst.get(i).intValue() > num.intValue())
			{
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args)
	{
		BSTCreation bst = new BSTCreation();
		List<Integer> ll = new ArrayList<>();
		
		ll.add(10);	ll.add(5); ll.add(1); ll.add(7); ll.add(40); ll.add(50);
		TreeNode<Integer> root =null;
		bst.creationBSTFromPreOrder(ll, 0, ll.size()-1,root);
		
	}
}
