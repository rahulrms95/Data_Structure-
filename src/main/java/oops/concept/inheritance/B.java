package oops.concept.inheritance;

public class B extends A{

	String type = "bClass";
	public static void staticMethod()
	{
		System.out.println("this is B static method");
	}
	
	public static int getNum()
	{
		return 2;
	}
	
	public void show()
	{
		System.out.println("B's class show Method");
	}
	
	//can't override final method of par
	/*public static void print()
	{
		System.out.println("B's class print Method");
	}*/
}
