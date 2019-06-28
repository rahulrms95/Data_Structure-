package oops.concept.threads;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class YieldClass implements Runnable{

	public static String name = "rahul";
	long count = 0;
	String threadName ;
	public YieldClass(int count,String name) {
		this.count = 0;
		this.threadName = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (name.intern()) {
			
			//System.out.println("Thead Name: "+Thread.currentThread().getName());
			System.out.println("Thead Name: "+this.threadName);
			while(true)
			{
				//System.out.println(Thread.currentThread().getName()+" :: "+count);
				//Thread.sleep(5);
				Thread.yield();

				count++;
			}
		}
	}

	public static void main(String[] args) {

		//ExecutorService e = new ThreadPoolExecutor(0, 0, 0, null, null);

		ThreadPoolExecutor tpe = new ThreadPoolExecutor(0,5, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
		Thread th1 = new Thread(new YieldClass(25,"Thread-1"),"Thread-1");
		th1.setPriority(1);
		Thread th2 = new Thread(new YieldClass(12,"Thread-2"),"Thread-2");
		th2.setPriority(3);
		Thread th3 = new Thread(new YieldClass(56,"Thread-3"),"Thread-3");
		th3.setPriority(2);
		Thread th4 = new Thread(new YieldClass(22,"Thread-4"),"Thread-4");
		th4.setPriority(8);
		Thread th5 = new Thread(new YieldClass(57,"Thread-5"),"Thread-5");
		th5.setPriority(7);
		Thread th6 = new Thread(new YieldClass(44,"Thread-6"),"Thread-6");
		th6.setPriority(10);
	
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		
		/*tpe.execute(th1);
		tpe.execute(th2);
		tpe.execute(th3);
		tpe.execute(th4);
		tpe.execute(th5);
		tpe.execute(th6);*/
		
		/*tpe.submit(th1);
		tpe.submit(th2);
		tpe.submit(th3);
		tpe.submit(th4);
		tpe.submit(th5);
		tpe.submit(th6);*/

	}
	/**
	 * To print input String 
	 * @param String {@value}
	 * @return void
	 * **/
	
	public void print(String str)
	{
		
	}


}
