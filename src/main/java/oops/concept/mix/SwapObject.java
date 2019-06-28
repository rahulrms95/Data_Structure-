package oops.concept.mix;

public class SwapObject {

	Person t;
	
	public SwapObject(Person p) {
		
		this.t = p;
	}
	
	public void swap(SwapObject o1, SwapObject o2)
	{
		Person temp =  o1.t;
		o1.t = o2.t;
		o2.t = temp;
	}
}
