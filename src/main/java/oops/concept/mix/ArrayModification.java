package oops.concept.mix;

public class ArrayModification {

	
	public static void main(String[] args) {
		
		int ar[] = {12,154};
		System.out.println("Before display method called "+ar[0]);
		display(ar);
		System.out.println("After display method called "+ar[0]);
	}
	
	public static void display(int arr[])
	{
		System.out.println("Before Inside display method "+arr[0]);
		arr[0] = 112;
		System.out.println("After Inside display method "+arr[0]);
		
	}
}
