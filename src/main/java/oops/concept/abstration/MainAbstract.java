package oops.concept.abstration;

import javax.management.RuntimeErrorException;

public class MainAbstract extends TestAbstract{

	@Override
	void absFun() {
		// TODO Auto-generated method stub
		
	}

	public void foo() throws RuntimeErrorException
	{
		throw new RuntimeErrorException(null);
	}
	
	public MainAbstract() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		new MainAbstract().foo();
	}
}
