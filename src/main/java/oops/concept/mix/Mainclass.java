package oops.concept.mix;

public class Mainclass {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneObject ob = new CloneObject(24, "rahul");
		CloneObject copy = (CloneObject) ob.clone();
		print(ob);
		print(copy);
		ob.setName("rrr");
		ob.setAge(33);
		print(ob);
		print(copy);
	}
	
	public static void print(CloneObject ob)
	{
		System.out.println(ob.name+" "+ob.age);
	}
}
