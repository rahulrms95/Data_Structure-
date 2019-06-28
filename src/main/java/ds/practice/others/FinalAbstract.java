package ds.practice.others;

public abstract class FinalAbstract {
		
	public abstract void print();
	
	public FinalAbstract(String name)
	{
	System.out.println("Final Abstract Class Constructor "+name);	
	}
	public final void test()
	{
		System.out.println("hello");
	}

}
