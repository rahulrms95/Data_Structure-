package oops.concept.mix;

public class CloneObject implements Cloneable{

	String name;
	int age;
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
		
	}
	public CloneObject(int age,String name)
	{
		this.name = name;
		this.age = age;
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
