package oops.concept.inheritance;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
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
