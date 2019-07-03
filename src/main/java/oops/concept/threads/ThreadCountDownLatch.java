package oops.concept.threads;

import java.util.concurrent.CountDownLatch;

public class ThreadCountDownLatch implements Runnable{

	public  CountDownLatch watch;
	public ThreadGroup thgp;
	public ThreadCountDownLatch(ThreadGroup thgp,CountDownLatch latch)
	{
		this.watch = latch;	
		this.thgp = thgp;
	}

	public static void main(String[] args) {
		
		CountDownLatch latch = new CountDownLatch(1);
		ThreadGroup thgp = new ThreadGroup("threadGroup1");
		ThreadGroup thgp2 = new ThreadGroup("threadGroup2");
		new Thread(new ThreadCountDownLatch(thgp,latch)).start();
		//new Thread(new ThreadCountDownLatch(thgp2,latch)).start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		countDownLatch(watch,thgp);
	}
	
	public void countDownLatch(CountDownLatch watch, ThreadGroup thgp)
	{
		String name = "Rahul";
		Thread th = new Thread(thgp,new ThreadClass(watch,name),"thread1");
		Thread th2 = new Thread(thgp,new ThreadClass(watch,name),"thread2");
		Thread th3 = new Thread(thgp,new ThreadClass(watch,name),"thread3");

		th.start();
		try {
			th.join();
			th2.start();
			th2.join();
			th3.start();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		try {
			System.out.println("Count Down Latch Value : " + watch.getCount());
			watch.await();
			System.out.println("After wait condition ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	

}
