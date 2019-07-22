package ds.practice.tree.binary;

import java.util.List;

import ds.practice.tree.pojo.TreeNode;

public class LCA {

	public boolean getLCA(TreeNode<Integer> root,TreeNode<Integer> node1,TreeNode<Integer> node2,List<Integer> path)
	{
		boolean result;
		if(root == null)
		{
			return false;
		}
		path.add(root.getValue());
		if(root.getValue() == node1.getValue())
		{
			return true;
		}
		else
		{
			result = getLCA(root.left,node1,node2,path) || getLCA(root.right, node1, node2,path);;
			if(!result)
			{
				for(int i=0;i<path.size();i++)
				{
					if(root.getValue() == path.get(i))
					{
						path.remove(i);
					}
				}
			}
			if(result)
			{
				for(int i=0;i<path.size();i++)
				{
					System.out.print(path.get(i)+" ");
				}
			}
		}
		return result;
	}
}
