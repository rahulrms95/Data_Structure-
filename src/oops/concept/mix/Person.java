package oops.concept.mix;

public class Person implements Comparable<Person>{

	private String name;
	private int age;
	
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
