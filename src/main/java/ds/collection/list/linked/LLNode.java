package ds.collection.list.linked;

public class LLNode {

	int value;
	public static LLNode next;
	
	public LLNode(int val)
	{
		this.value = val;
		next = null;
	}
	public int getValue()
	{
		return this.value;
	}
	
	public int size(LLNode lst)
	{
		int len = 0;
		while(lst!= null)
		{
			lst = lst.next;
			len++;
		}
		return len;
	}
}
