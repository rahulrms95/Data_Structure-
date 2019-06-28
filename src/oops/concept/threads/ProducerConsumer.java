package oops.concept.threads;

import java.util.LinkedList;

public class ProducerConsumer {

	public static LinkedList<Integer> ll = new LinkedList<>();
	int listSize = 15;
	public void producer() 
	{

		synchronized (this) 
		{
			if(ll.size()>= 15)
			{
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public void consumer()
	{
		synchronized (this) {
			
		}
	}
}
