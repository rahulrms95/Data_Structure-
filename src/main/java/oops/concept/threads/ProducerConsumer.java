package oops.concept.threads;

import java.util.LinkedList;

public class ProducerConsumer implements Runnable{

	public static LinkedList<Integer> ll = new LinkedList<>();
	int listSize = 5;
	public void producer(int value) 
	{

		synchronized (ll) 
		{
			if(ll.size()>= listSize)
			{
				try {
					ll.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			System.out.println("Producer : "+value);
			ll.add(value);
			ll.notify();
		}
	}

	public void consumer()
	{
		synchronized (ll) {

			while(true)
			{
				if(ll.size()==0)
				{
					try {
						ll.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Consumer : "+ll.removeFirst());
				ll.notify();
			}

		}
	}

	public static void main(String[] args) {

		Thread th = new Thread(new ProducerConsumer());
		th.start();
		int i = 0;
		while(true)
		{
			new ProducerConsumer().producer(i);
			i++;
		}
	}

	@Override
	public void run() {
		
		consumer();
		
	}
}




