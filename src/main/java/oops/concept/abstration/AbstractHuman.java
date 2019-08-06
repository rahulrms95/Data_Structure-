package oops.concept.abstration;

public abstract class AbstractHuman {

	public String name;
	int age;
	String gender;
	
	public AbstractHuman(String name,int age,String gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public final void printDetails()
	{
		System.out.println("Name: "+this.name+" Gender: "+this.gender+" Age: "+this.age);
	}
	
	public abstract String getDetails();
}

