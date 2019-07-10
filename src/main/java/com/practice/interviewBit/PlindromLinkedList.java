package com.practice.interviewBit;

import java.util.ArrayList;
import java.util.List;

import ds.collection.list.linked.LLNode;

public class PlindromLinkedList {

	public static int isPlin(LLNode node)
	{
		List<LLNode> lst = new ArrayList<>();
		
		LLNode curr = node;
		
		while(curr != null)
		{
			lst.add(curr);
			curr = curr.next;
		}
		
		int i = lst.size()-1;
		while(i>=0)
		{
			if(lst.get(i) != node)
			{
				return 0;
			}
			
			node = node.next;
			i++;
		}
		
		return 1;
	}
	
	public static void main(String[] args) {
		
		LLNode head = new LLNode(1);
		head.next = new LLNode(2);
		head.next.next = new LLNode(3);
		head.next.next.next = new LLNode(4);
		head.next.next.next.next = new LLNode(5);

		System.out.println(isPlin(head));
	}
	
}
