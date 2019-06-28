package oops.concept.Static;

public class StaticProgram {

	static String a;
	static 
	{
		System.out.println("2nd Static block called "+a);
	}
	static 
	{
		System.out.println("1st Static block called "+a);
	}
	public static void main(String[] args) {
		
	} 
	public static void print()
	{
		System.out.println("Printing Value a "+a);
	}
	
	static 
	{
		System.out.println("3rd Static block called "+a);
	}
	
	static class test
	{
		
	}
}
