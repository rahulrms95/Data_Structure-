package ds.collection.list.linked;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

	public LLNode root;

	public LinkedList()
	{
		this.root = null;
	}
	public static void main(String[] args) {

		List<Integer> ls = new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			ls.add(i*2);
		}
		LinkedList ll = new  LinkedList();
		
		LLNode list = ll.createLinkedList(ls);
		ll.printList(list);
	}

	public LLNode createLinkedList(List<Integer> lst)
	{
		LLNode list ;
		list = new LLNode(lst.remove(0));
		root = list;
		while(!lst.isEmpty())
		{
			list.next = new LLNode(lst.remove(0));
			list = list.next;
		}
		return root;
	}
	
	public void printList(LLNode lst)
	{
		while(lst!= null)
		{
			System.out.print(lst.getValue()+" ");
			lst  = lst.next;
		}
		
	}
}
