package oops.concept.inheritance;

public class BaseClass {

	
	String name;
	
	public A getClassObj()
	{
		System.out.println("Base Class A ");
		return new A();
	}
	public BaseClass(String name)
	{
		this.name = name;
	}
	public void print()
	{
		System.out.println("This is BaseClass Print Method");
	}
	
	public void show()
	{
		System.out.println("This is BaseClass show Method");
	}
	
}




