package ds.collection.list.linked;

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

	public static void main(String[] args) {

		LLNode head = new LLNode(1);
		head.next = new LLNode(2);
		head.next.next = new LLNode(3);
		head.next.next.next = new LLNode(4);
		head.next.next.next.next = new LLNode(5);
		head.next.next.next.next.next = new LLNode(6);
		head.next.next.next.next.next.next = new LLNode(7);
		head.next.next.next.next.next.next.next = new LLNode(8);
		head.next.next.next.next.next.next.next.next = new LLNode(9);
		LLNode root = kReverse(head,3);

		LinkedList lst = new LinkedList();

		lst.printList(root);

	}
}
