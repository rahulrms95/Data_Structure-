package ds.collection.list.linked;

import java.util.ArrayList;
import java.util.List;

public class KAlternateReverse {

	public static LLNode kReverse(LLNode head,int k)
	{
		LLNode newHead = null;
		LLNode current = head;
		LLNode prev = null;
		LLNode next = null;
		LLNode tempPrev = null;
		LLNode tempCurr = head;
		int count = 1;
		while(current != null && current.next != null)
		{
			prev = null;
			next = null;
			count = 0;
			tempCurr = current;
			while(k>count && current != null) // reverse k nodes 
			{
				next = current.next;
				current.next = prev;
				prev = current ;
				current = next;
				count++;
			}

			tempCurr.next = current; // after reverse tempCurr points to next current
			if(tempPrev == null)
			{
				tempPrev = tempCurr;
			}
			else
			{
				tempPrev.next = prev;
				tempPrev = tempCurr;
			}
			if(newHead == null)
			{
				newHead = prev;
			}

		}
		return newHead;

	}


	public static LLNode kAlternateReverse(LLNode head,int k)
	{
		LLNode newHead = null;
		LLNode current = head;
		LLNode prev = null;
		LLNode next = null;
		LLNode tempPrev = null;
		LLNode tempCurr = head;
		int count;
		boolean flag = true;
	
		while(current != null)
		{
			if(flag)
			{
				prev = null;
				next = null;
				count = 0;
				tempCurr = current;
				while(k>count && current != null) // reverse k nodes 
				{
					next = current.next;
					current.next = prev;
					prev = current ;
					current = next;
					count++;
				}
				if(tempPrev == null)
				{
					tempCurr.next = current; // after reverse tempCurr points to next current
					tempPrev = tempCurr;
				}
				else
				{
					tempPrev.next = prev;
					tempPrev = tempCurr;
				}

				if(newHead == null)
				{
					newHead = prev;
				}
				flag = false;
			}
			else
			{
				count = 0;
				while(k>count && current != null) // move to next k nodes 
				{
					tempPrev = current;
					current = current.next;
					count++;
				}
				flag = true;
			}

		}
		return newHead;

	}

	public static void main(String[] args) {

		LinkedList lst = new LinkedList();
		List<Integer> ls = new ArrayList<>();
		int n=27;

		for(int i=1;i<=n;i++)
		{
			ls.add(i);
		}
		LLNode root3 = lst.createLinkedList(ls);
		
		//LLNode root = kReverse(head,3);
		LLNode root2 = kAlternateReverse(root3,9);
		lst.printList(root2);

	}
}
