package oops.concept.mix;

public class CloneObject implements Cloneable{

	String name;
	int age;
	Person p;
	public Object clone() throws CloneNotSupportedException
	{
		CloneObject copy = (CloneObject) super.clone();
		copy.p = (Person) copy.p.clone();
		return copy;
		
	}
	public CloneObject(int age,String name,Person p)
	{
		this.name = name;
		this.age = age;
		this.p = p;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int n)
	{
		this.age = n;
	}
}
