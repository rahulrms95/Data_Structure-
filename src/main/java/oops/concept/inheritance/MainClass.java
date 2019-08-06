package oops.concept.inheritance;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		
		A a = new B();
		//a.staticMethod();
		a.show();
		System.out.println(a.type);
		Object ob;
		B b = new B();
		b.getNum();
		b.staticMethod();
		b.show();
		System.out.println(b.type);
		
		A a1 = new A();
		a1.staticMethod();
		a1.show();
		System.out.println(a1.type);
		/*System.out.println(" Base Class Reference ");
		BaseClass base = new ChildClass("test");
		base.show();
		base.print();
		base.toString();*/
		
		List<Integer> ls = new ArrayList<>();
		
		//System.out.println(" \nChild Class ");
		BaseClass child = new ChildClass("test");
		child.getClassObj();
	//	System.out.println(" \nBase Class ");
		BaseClass base1 = new BaseClass("test");
		//base1.getAClass();
 	}
}
