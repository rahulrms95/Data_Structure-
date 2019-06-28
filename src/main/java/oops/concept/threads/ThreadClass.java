package oops.concept.threads;

public class ThreadClass implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println("ThreadClass is running..");
	}

}
