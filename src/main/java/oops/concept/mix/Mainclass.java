package oops.concept.mix;

import java.util.HashMap;
import java.util.Map;

public class Mainclass {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person p1 = new Person("abc", 12);
		Person p2 = new Person("abc", 12);
		Map<Person, String> map = new HashMap<>();
		
		map.put(p1,p1.getName()+p1.getAge());
		map.put(p2, p2.getName()+p2.getAge());
		
		System.out.println(map);
		
		Person p3 = new Person("abc", 12);
		System.out.println(map.get(p3));
		/*CloneObject ob = new CloneObject(24, "rahul");
		CloneObject copy = (CloneObject) ob.clone();
		print(ob);
		print(copy);
		ob.setName("rrr");
		ob.setAge(33);
		print(ob);
		print(copy);*/
	}
	
	public static void print(CloneObject ob)
	{
		System.out.println(ob.name+" "+ob.age);
		
		
		
	}
}
