package oops.concept.Static;

import java.util.Scanner;

public class StaticProgram {

	static Scanner sc;
	static String a;
	static int num;
	static 
	{
		sc = new Scanner(System.in);
		num = sc.nextInt();
		String.valueOf(num);
		if(num<=0)
		{
			try {
				throw new Exception("Breadth and height must be positive");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
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
