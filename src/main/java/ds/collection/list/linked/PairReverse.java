package ds.collection.list.linked;

public class PairReverse {

	
	public static LLNode reverseInPair(LLNode head)
	{
		LLNode current = head;
		LLNode prev = null,newhead = null;
		
		while(current != null && current.next != null)
		{
			LLNode next = current.next;
			current.next = next.next;
			next.next = current;
			if(newhead == null)
			{
				newhead = next;
			}
			if(prev != null)
			{
				prev.next = next;
			}
			prev = current;
			current = current.next;
		}
		return newhead;
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
		LLNode root = reverseInPair(head);
		
		LinkedList lst = new LinkedList();
		
		lst.printList(root);
		

	}
}
