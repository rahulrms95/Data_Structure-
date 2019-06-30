package ds.practice.tree.bst;

public class MainClass {

	
	public static void main(String[] args) {
		
		BST bs = new BST();
		Node root = null;
		for(int i=0;i<10;i++)
		{
		 root = bs.insertBST(root, i+5);
		}
		new MainClass().print(root);
	}
	
	public void print(Node root)
	{
		if(root == null)
		{
			return;
		}
		else
		{
			System.out.println(root.val);
			print(root.left);
			print(root.right);
		}
	}
}







