package ds.tree.bst;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Test implements Comparable<Test>{

	
	private String name;
	private int id;
	public Test(String n,int i)
	{
		this.name = n;
		this.id = i;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Test> lst = new ArrayList<>();
		
		lst.add(new Test("puneet", 1215));
		lst.add(new Test("rahul", 1302));
		lst.add(new Test("pawan", 1147));
		
		Collections.sort(lst);
		
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i).name+" "+lst.get(i).id);
		}
		Collections s;
		List<String> l ;
		ArrayList<String> al;
		HashMap<String, Integer> hm;
		Collection<String> cl;
		Object object = new Object();
		Object object1 = object;
		Object object2 = object;
		
		
	}

	@Override
	public int compareTo(Test o) {
		// TODO Auto-generated method stub
		//return o.name.compareTo(this.name);
		return this.id-o.id;
	}
	
	
	
	public class BST
	{
		Node root;
		
		public BST()
		{
			root = null;
		}
			
		public Node insertBST(Node root, int val)
		{
			if(root==null)
			{
				root = new Node(val);
			}
			else
			{
				if(root.val>val)
				{
					root.left = insertBST(root.left, val);
				}
				else
				{
						root.right = insertBST(root.right, val);
				}
			}
			return root;
		}
	}
	
	public class Node
	{
		Node left;
		Node right;
		int val;
		
		public Node(int v)
		{
			this.val = v;
			left = null;
			right = null;
		}
	}
}
