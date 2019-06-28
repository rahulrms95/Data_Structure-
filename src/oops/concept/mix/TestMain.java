package oops.concept.mix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain {
	
	public static void main(String[] args) {
		
		
		
		
		Person p1 = new Person("11", 3102);
		Person p2 = new Person("22", 1202);
		
		SwapObject w = new SwapObject(null);
		SwapObject w1 = new SwapObject(p1);
		SwapObject w2 = new SwapObject(p2);
		System.out.println(w1.t.getName()+" "+w2.t.getName());
		
		w.swap(w1, w2);
		//new TestMain().swap(w1, w2);
		
		System.out.println(w1.t.getName()+" "+w2.t.getName());
		
		
		
		
		List<Person> lst = new ArrayList<>();
		lst.add(new Person("rahul", 29));
		lst.add(new Person("Puneet",23));
		lst.add(new Person("Awan",27));
		lst.add(new Person("Zwan",37));
		lst.add(new Person("Mwan",17));
		
		Collections.sort(lst,new AgeSort());
		
		for(int i=0;i<lst.size();i++)
		{
		//	System.out.println(lst.get(i).getName()+" "+lst.get(i).getAge());
		}
	}
	
	public void swap(SwapObject o1, SwapObject o2)
	{
		Person temp =  o1.t;
		o1.t = o2.t;
		o2.t = temp;
	}

}
