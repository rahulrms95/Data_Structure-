package ds.practice.manipulation.bits;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PowerOfNumber implements Runnable{

	int num;
	public PowerOfNumber(int n) {
		// TODO Auto-generated constructor stub
		this.num = n;
	}
	
	public static void main(String[] args) {
		
		int i=1;
	//	PowerOfNumber pn = new PowerOfNumber();
		ExecutorService es= Executors.newFixedThreadPool(2);
		Runnable rn1 = new PowerOfNumber(2);
		Runnable rn2 = new PowerOfNumber(3);
		Runnable rn3 = new PowerOfNumber(4);
		Runnable rn4 = new PowerOfNumber(5);
		Runnable rn5 = new PowerOfNumber(6);
		Runnable rn6 = new PowerOfNumber(7);
		Runnable rn7 = new PowerOfNumber(8);
		/*es.execute(rn1);
		es.execute(rn2);
		es.execute(rn3);
		es.execute(rn4);
		es.execute(rn5);
		es.execute(rn6);
		es.execute(rn7);*/
		
		/*es.execute(new PowerOfNumber(2));
		es.execute(new PowerOfNumber(3));
		es.execute(new PowerOfNumber(4));
		es.execute(new PowerOfNumber(5));
		es.execute(new PowerOfNumber(6));
		es.execute(new PowerOfNumber(7));
		es.execute(new PowerOfNumber(8));*/
		
		
		
		PowerOfNumber n1 = new PowerOfNumber(2);
		PowerOfNumber n2 = new PowerOfNumber(3);
		PowerOfNumber n3 = new PowerOfNumber(4);
		PowerOfNumber n4 = new PowerOfNumber(5);
		PowerOfNumber n5 = new PowerOfNumber(6);
		PowerOfNumber n6 = new PowerOfNumber(7);
		PowerOfNumber n7 = new PowerOfNumber(8);
		
		es.execute(n1);
		es.execute(n2);
		es.execute(n3);
		es.execute(n4);
		es.execute(n5);
		es.execute(n6);
		es.execute(n7);

		//es.execute(new PowerOfNumber(9));
		Long lo;
		//System.out.println(pn.powerOfNum(5, 250));
		
		
		
	}
	
	public long powerOfNum(int num,int power)
	{
		try {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(1<<power);
		return 1<<power;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		powerOfNum(1,this.num);
	}
}
