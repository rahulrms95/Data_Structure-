package version.java.eight.newfeature;

@FunctionalInterface
public interface FunctionInterface {

	int var=0;
	public void method(int value);
	
	static void staticMethod()
	{
		System.out.println("this is static Example");
	}
	
	default void defaultMethod()
	{
		System.out.println("this is default Example");
	}
}
