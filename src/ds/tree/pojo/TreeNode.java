package ds.tree.pojo;

public class TreeNode<K> {

	K value;
	public TreeNode<K> left;
	public TreeNode<K> right;
	public TreeNode(K val)
	{
		this.value = val;
		this.left = null;
		this.right = null;
	}
	
	public K getValue()
	{
		return value;
	}
}
