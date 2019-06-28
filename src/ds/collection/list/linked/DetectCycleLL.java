package ds.collection.list.linked;

import java.util.HashSet;
import java.util.Set;

public class DetectCycleLL {


	public boolean isCyclePreset(LLNode head)
	{
		LLNode slow = head;
		LLNode fast = head;

		while(slow != null && fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		LLNode head = new LLNode(1);
		head.next = new LLNode(2);
		head.next.next = new LLNode(3);
		head.next.next.next = new LLNode(4);
		head.next.next.next.next = new LLNode(5);
		head.next.next.next.next.next = head.next.next.next;


		//head.next.next.next.next.next = head.next;
		//head.next.next.next.next.next = null;
		
		
		DetectCycleLL dc = new DetectCycleLL();
		
		System.out.println(dc.isCyclePreset(head));
		System.out.println(dc.isCyclicLinkedList(head));
		System.out.println(dc.startCycleNode(head).value);
	}

	public LLNode startCycleNode(LLNode head)
	{
		LLNode slow = head;
		LLNode fast = head;
		LLNode point = new LLNode(-1);
		boolean isCycle = false;
		while(slow != null && fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
				isCycle = true;
				break;
			}
		}
		if(isCycle)
		{
			slow = head;
			
			while(slow != fast)
			{
				slow = slow.next;
				fast = fast.next;
			}
			point = slow;
		}

		return point;
	}
	
	public LLNode isCyclicLinkedList(LLNode node)
	{
		Set<LLNode> set = new HashSet<>();
		LLNode newhead=null;
		while(node != null)
		{
			if(set.contains(node))
			{
				
			}
			set.add(node);
			node = node.next;
		}
		
		return newhead;
	}
}
