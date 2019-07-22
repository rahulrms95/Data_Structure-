package oops.concept.threads;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest implements Runnable{

	CountDownLatch latch;
	public CountDownLatchTest(CountDownLatch latch)
	{
		this.latch = latch;
	}
	
	public static void main(String[] args) {
		
		CountDownLatch latch = new CountDownLatch(2);
		CountDownLatchTest test = new CountDownLatchTest(latch);
		
		new Thread(test,"Thread-1").start();
		new Thread(test,"Thread-2").start();
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("After Count Down Latch................");
		System.out.println();
		
		CountDownLatchTest test1 = new CountDownLatchTest(latch);
		new Thread(test1,"Thread-3").start();
		new Thread(test1,"Thread-4").start();
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("After Count Down Latch................");
		
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		int size = 0;
		while(size<10)
		{
			System.out.println(Thread.currentThread().getName()+" Running thread");
			size++;
		}
		latch.countDown();
		
	}
}
