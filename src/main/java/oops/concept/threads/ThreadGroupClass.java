package oops.concept.threads;

public class ThreadGroupClass {

	
	public static void main(String[] args) {
		
		ThreadGroup tg = new ThreadGroup(new ThreadGroup("ParentThreadGroup"),"customThreadGroup");
		
		Runnable rn1 = new ThreadClass(null, null);
		
		new Thread(tg,rn1,"Custom-Thread").start();
	}
	
}
