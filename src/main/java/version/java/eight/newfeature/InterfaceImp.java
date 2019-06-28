package version.java.eight.newfeature;

public class InterfaceImp implements Interface{

	@Override
	public void needToImpl() {
		// TODO Auto-generated method stub
		System.out.println("This is needToImp Method in implementation");
	}
	
	 void staticMethod()
	{
		System.out.println("This is static in Implement Interface");
	}

	public void defaultMethod()
	{
		System.out.println("This is default in implement Interface");
	}
}
