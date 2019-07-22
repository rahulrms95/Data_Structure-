package oops.concept.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicThread implements Runnable{

	private CyclicBarrier barrier;

	public CyclicThread(CyclicBarrier barrier)
	{
		this.barrier = barrier;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is Cyclic Thread.....");
		try {
			this.barrier.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
