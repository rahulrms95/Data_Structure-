package ds.collection.queue;

public class QueueUsingArray {

	
	private int queue[];
	int num_count ;
	public QueueUsingArray(int size) {
		// TODO Auto-generated constructor stub
		queue = new int[size];
		num_count = 0;
	}
	public void enqueue(int value)
	{
		try
		{
			 queue[num_count] = value;
			 num_count++;
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Queue is Full and Size of Queue:  "+num_count);
		}
	
	}
	
	public int dequeue()
	{
		int val = queue[0];
		if(queue.length <=0)
		{
			return -1;
		}
		num_count--;
		for(int i=0;i<num_count;i++)
		{
			queue[i]=queue[i+1];
		}
		return val;
	}
	
	public int[] getQueue()
	{
		return queue;
	}
}
