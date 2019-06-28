package ds.tree.travesal;

import java.util.ArrayList;
import java.util.List;

import ds.tree.pojo.TreeNode;
import ds.tree.utility.TreeUtility;

public class MainClass {

	
 	
	public MainClass() {}
	
	public static void main(String[] args)
	{

		// TODO Auto-generated constructor stub
		Traversal<Integer> pre = new PreOrderTraversal();
		Traversal<Integer> post = new PostOrderTraversal();
		Traversal<Integer> in = new InOrderTraversal();
		TreeUtility<Integer> utility = new TreeUtility<>();

		List<Integer> lst = new ArrayList<>();
		Integer [] arr = {5,7,10,11,15,17,20};

		TreeNode<Integer> root = utility.createTree(arr);
		
		System.out.println("Pre Order");
		pre.traversal(root);
		System.out.println("\nPost Order");
		post.traversal(root);
		System.out.println("\nIn Order");
		in.traversal(root);
	
		
	}
}
