package oops.concept.inheritance;

public class A {

	String type = "aClass";
	public static void staticMethod()
	{
		System.out.println("this is A static method");
	}
	
	private int getNum()
	{
		return 2;
	}
	 void show()
	{
		System.out.println("A's class show Method");
	}
	 
	 final void print()
	 {
		 System.out.println("A's class print Method");
	 }
	 
	 public void status()
	 {
		 System.out.println("This is Class A method Status");
	 }
	 
	 class Inner{
		 
		 public String inner;
		 
		 public String getInner()
		 {
			 return this.inner;
		 }
		 
	 }
}
