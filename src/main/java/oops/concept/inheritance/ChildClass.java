package oops.concept.inheritance;

public class ChildClass extends BaseClass{

	
	
	public ChildClass(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public B getClassObj()
	{
		System.out.println("Child Class B ");
		return new B();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("This is child Show Method");
	}

	public void print()
	{
		System.out.println("This is Child Print Method");
	}
	
	public void toString(ChildClass ch)
	{
		String ss = ch.getClass()+"@"+Integer.toHexString(ch.hashCode());
		System.out.println(ss);
	}
	
}
