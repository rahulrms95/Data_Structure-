package oops.concept.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadTwiceStart implements Runnable {
    public static void main(String[] args) throws InterruptedException{
        // creating a thread 
    /*    Thread t = new Thread(new ThreadTwiceStart(), "MyThread1");
        t.start();
         t.join();       
        t = new Thread(new ThreadTwiceStart(), "MyThread2");        
        t.start();*/
    	ThreadTwiceStart tht = new ThreadTwiceStart();
    	new Thread(tht).start();
    	
    	int i= 1;
    	while(true)
    	{
    		try {
    			Thread.sleep(200);
    			tht.produce(i);
    			i++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    }

    @Override
    public void run() {
    	consumer();
    }
    
    List<Integer> lst = new ArrayList<>();
    public void consumer()
    {
    	synchronized (this) {
			
    		while(true)
    		{
    			if(lst.size()==0)
    			{
    				try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    			}
    			else
    			{
    				System.out.println("Consume value "+lst.remove(0));
    				notify();
    			}
    		}
		}
    }
    
    public void produce(int v) throws InterruptedException
    {
    	synchronized (this) {
			
    		System.out.println("Produce Value "+v);
    		lst.add(v);
    		notify();
    		wait();
		}
    }
}