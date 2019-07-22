package oops.concept.threads;

public class PrintString implements Runnable{


	public PrintString()
	{
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {

			if(Thread.currentThread().getName().equals("1"))
			{
				for(int i=0;i<5;i++)
				{
					System.out.print("Hello ");
					try {
						notify();
						if(i!=4)
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			else
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("World");
					notify();
					try {
						if(i!=4)
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}
	}


	public static void main(String[] args) throws InterruptedException {

		PrintString pr = new PrintString();
		
		Thread th1 = new Thread(pr,"1");
		Thread th2 = new Thread(pr,"2");
		
		th1.start();
		th2.start();
		th2.join();
		System.out.println(" ");
		Thread th3 = new Thread(pr,"1");
		Thread th4 = new Thread(pr,"3");
		th3.start();
		th4.start();

	}

}
