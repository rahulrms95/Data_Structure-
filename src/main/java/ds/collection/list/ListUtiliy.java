package ds.collection.list;

import java.util.List;

import ds.collection.list.linked.LLNode;

public class ListUtiliy <K>{

	
	public LLNode getMiddleNode(LLNode head)
	{
		LLNode slow = head;
		LLNode fast = head;
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
			
		return slow;
	}
	
	public void print(List<K> lst)
	{
		System.out.println("List data :: ");
		for(int i=0;i<lst.size();i++)
		{
			System.out.print(lst.get(i)+" ");
		}
	}
}
