package oops.concept.threads;

public class ThreadExtend extends Thread{

	public ThreadExtend(String string) {
		super(string);
	}

	public void run()
	{
		System.out.println("this is thread "+this.getName());
		
	}
	
	public static void main(String[] args) {
		
		ThreadExtend te = new ThreadExtend("name");
		te.start();
	}
}
