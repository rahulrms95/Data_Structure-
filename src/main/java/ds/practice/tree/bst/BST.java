package ds.practice.tree.bst;

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
