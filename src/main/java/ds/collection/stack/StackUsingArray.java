package ds.collection.stack;

public class StackUsingArray {

	int stack[];
	int num_count;
	public StackUsingArray(int size) {
		// TODO Auto-generated constructor stub
		stack = new int[size];
		num_count = 0;
	}
	public void push(int value)
	{
		try
		{
			stack[num_count] = value;
			num_count--;
		}
		catch(IndexOutOfBoundsException	e)
		{
			System.out.println("Stack is full and size of Stack :"+num_count);
		}
	}
	
	public int pop()
	{
		int val = -1;
		if(stack.length>0)
		{
			val = stack[0];
			num_count--;
			for(int i=0;i<num_count;i++)
			{
				stack[i] = stack[i+1];
			}
		}
		else
		{
			System.out.println("Stack is empty ");
			return -1;
		}
		return val;
	}
}
