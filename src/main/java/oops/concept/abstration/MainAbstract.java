package oops.concept.abstration;

import javax.management.RuntimeErrorException;

public class MainAbstract extends TestAbstract{

	public MainAbstract() {
	}

	@Override
	void absFun() {
		// TODO Auto-generated method stub
		
	}

	public void foo() throws RuntimeErrorException
	{
		throw new RuntimeErrorException(null);
	}
	
	static class StaticClass
	{
		static void print()
		{
			System.out.println("Static method");
		}
	}
	
	public static void main(String[] args) {
		
		StaticClass cl = null;// = new StaticClass();
		cl.print();
		//new MainAbstract().foo();
	//	final String s=";";	
		int vl = -4;
		int pv = 4;
		//System.out.println(vl<<31);
		System.out.println(vl>>1);
		String str1 ="rahul";
		String str2 = "rahul";
		
		System.out.println("String value : "+(str1==str2));
	}
}
