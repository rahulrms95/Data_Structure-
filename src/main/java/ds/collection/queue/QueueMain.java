package ds.collection.queue;

public class QueueMain {

	
	public static void main(String[] args) {
		
		QueueUsingArray q = new QueueUsingArray(10);
		
		
		for(int i=0;i<15;i++)
			{
				q.enqueue(i*3);
			
			}
		int arr[] = q.getQueue();
		
		for(int i=0;i<10;i++)
		{
			System.out.println(q.dequeue());
		}
		
	}
}
