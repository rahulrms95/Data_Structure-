package oops.concept.mix;

public class Person implements Comparable<Person>,Cloneable{

	private String name;
	private int age;
	
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name+age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p = (Person)obj;
		return (this.name.equals(p.name) && this.age-p.age==0)?true:false;
	}
	
	public Person(String na,int a)
	{
		this.setName(na);
		this.setAge(a);
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
