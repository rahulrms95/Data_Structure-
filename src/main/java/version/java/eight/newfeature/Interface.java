package version.java.eight.newfeature;

public interface Interface {

	public default void defaultMethod()
	{
		System.out.println("This is default Method");
	}
	
	public static void staticMethod()
	{
		System.out.println("This is static Method");
	}
	
	public void needToImpl();
}
