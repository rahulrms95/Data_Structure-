package oops.concept.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest implements Runnable{

	private CyclicBarrier barrier;
	
	public CyclicBarrierTest(CyclicBarrier barrier)
	{
		this.barrier = barrier;
	}

	public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
		
		Thread th3 = new Thread(new PrintString(),"Thread-2");
		CyclicBarrier barrier = new CyclicBarrier(4,th3);
		CyclicBarrierTest cyclic = new CyclicBarrierTest(barrier);
		new Thread(cyclic,"Thread-1").start();
		new Thread(cyclic,"Thread-2").start();
		barrier.await();
		System.out.println("After Thread Waiting...");
		
		System.out.println("Reusing Cyclic Barrier Again...");
		Thread th1 = new Thread(cyclic,"Thread-1");
		Thread th2 = new Thread(cyclic,"Thread-2");
		th1.start();
		th2.start();
		th3.start();
		barrier.await();
		System.out.println("After Reusing Cyclic Barrire Object...");
	}
	@Override
	public void run() {
		
		int test = 0;
		while(test<10)
		{
			System.out.println(Thread.currentThread().getName()+" Thread Running "+test);
			test++;
		}
		try {
			barrier.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
