package oops.concept.mix;

public class ObjectModification {

	public static void updateObject(Person ob)
	{
		ob.setName("rahul");
		ob.setAge(24);
	}
	
	public static void main(String[] args) {
		
		Person o1 = new Person("abc",34);
		Person o2 = new Person("xyz",14);
		//System.out.println(o1.getName()+" "+o1.getAge());
		//updateObject(o1);
		//System.out.println(o1.getName()+" "+o1.getAge());
		System.out.println(o1 + " "+ o2);
		
		swap(o1,o2);
		
		System.out.println(o1 + " "+ o2);
	}
	
	public static void swap(Person p1,Person p2)
	{
		System.out.println(p1 + " "+ p2);
		Person t = p1 ;
		p1 = p2;
		p2 = t;
		
		System.out.println(p1 + " "+ p2);
	}
}
