package oops.concept.Static;

import oops.concept.Static.StaticProgram.test;

public class MainClass {

	public MainClass() {

	}
	
	public void print()
	{
		System.out.println("Printing this......");
	}
	
	public static void main(String[] args) {
		
		StaticProgram.print();
		StaticProgram.print();
		StaticProgram.print();
		test t = new test();
		
		try {
			MainClass mc = (MainClass) Class.forName("oops.concept.Static.MainClass").newInstance();
			mc.print();
			System.out.println(Class.forName("oops.concept.Static.MainClass"));
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
