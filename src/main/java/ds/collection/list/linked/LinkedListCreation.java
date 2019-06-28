package ds.collection.list.linked;

import java.util.Scanner;

public class LinkedListCreation {




	public static void main(String[] args) {

		Scanner ss = new Scanner(System.in);

		int size = 10 ;
		//ss.nextInt();
		//LLNode root = null;
		LLNode head = null;
		while(size>0)
		{
			int val = size;
			head = addNode(head,val);
			size--;
		}
		
		printReverse(head);
		System.out.println();
		print(head);
	
	}

	public static LLNode addNode(LLNode root,int val)
	{
		if(root == null)
		{
			root = new LLNode(val);
		}
		else
		{
			LLNode temp = root;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = new LLNode(val);
		}

		return root;
	}

	public static void print(LLNode head)
	{
		LLNode temp = head;
		while(temp != null)
		{
			System.out.print(temp.value+"->");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void printReverse(LLNode head)
	{
		LLNode temp = reverseLL(head);
		while(temp != null)
		{
			System.out.print(temp.value+"->");
			temp = head.next;
		}
		System.out.println();
	}

	public static LLNode reverseLL(LLNode head)
	{
		LLNode next = null;
		LLNode prev = null;
		LLNode current = head;

		while(current!= null)			
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		head = prev;

		return head;
	}

}
