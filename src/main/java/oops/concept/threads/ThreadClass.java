package oops.concept.threads;

import java.util.concurrent.CountDownLatch;

public class ThreadClass extends Thread implements Runnable{

	CountDownLatch count;
	String name;
	public ThreadClass(CountDownLatch count,String name)
	{
		this.name = name;
		this.count = count;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//synchronized (name) 
		{
			int i=1;
			while(i<5)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+" ThreadClass is running.."+i+" THGRP:: "+Thread.currentThread().getThreadGroup().getName());
				i++;
			}
			this.count.countDown();
		}

	}
}
