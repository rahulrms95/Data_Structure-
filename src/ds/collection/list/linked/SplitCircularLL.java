package ds.collection.list.linked;

import java.util.HashSet;

public class SplitCircularLL {

	
	
	public static void main(String[] args) {

		LLNode head = new LLNode(1);
		head.next = new LLNode(2);
		head.next.next = new LLNode(3);
		head.next.next.next = new LLNode(4);
		head.next.next.next.next = new LLNode(5);


		head.next.next.next.next.next = head.next;
		//head.next.next.next.next.next = null;
		//DetectCycleLL dc = new DetectCycleLL();

		SplitCircularLL sl = new SplitCircularLL();
		System.out.println();
		sl.splitLL(head);
	}
	
	
	public void splitLL(LLNode head)
	{
		DetectCycleLL dc = new DetectCycleLL();

		LLNode cycle = dc.startCycleNode(head);
		System.out.println(dc.startCycleNode(head).value);

		LLNode prev = null;
		if(cycle.value != -1)
		{
			HashSet<LLNode> set = new HashSet<>();
			while(!set.contains(cycle))
			{
				prev = cycle;

				set.add(cycle);
				cycle = cycle.next;
			}
			System.out.println("Last Node in LL: "+prev.value);
		}
		
		LLNode head1 = head;
		while(head1 != null)
		{
			System.out.println(head1.value);
			if(head1 == prev)
			{
				head1 = null;
				break;
			}
			head1 = head1.next;
		}
		
		
	}
	
}
