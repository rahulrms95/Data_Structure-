package ds.practice.tree.binary;

import java.util.ArrayList;
import java.util.List;

import ds.practice.tree.pojo.TreeNode;

public class MainTree {

	
	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<Integer>();
		int size = 10;
		for(int i=1;i<=size;i++)
		{
			lst.add(i);
		}
		BinayTreeUtililty bu = new BinayTreeUtililty();
		TreeNode root = bu.createBT(lst);
		bu.printRecursive(root);
		LCA lca = new LCA();
		
		boolean result = lca.getLCA(root, new TreeNode<Integer>(5), new TreeNode<Integer>(9),new ArrayList<>());
		System.out.println();
		System.out.println("Node Found :: "+result);
		//bu.isNodeExist(root, new TreeNode<Integer>(9));
		
	//	System.out.println("Node Found :: "+bu.isNodeExist(root, new TreeNode<Integer>(1)));
	}
}
