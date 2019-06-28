package oops.concept.mix;

import java.util.Arrays;

public class ArrayComparison {

	public static void main(String[] args) {
		
		int[] ar1 = {1,2,3} ;
		int[] ar2 = {1,2,3} ;
		
		System.out.println(Arrays.equals(ar1, ar2));
		System.out.println(ar1.equals(ar2));
		System.out.println(ar1==ar2);
	}
}
