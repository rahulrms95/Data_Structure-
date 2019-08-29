package com.interview.questions;

import ds.practice.array.ArrayUtility;

public class ArrayElementReplace {

	 int[] replace(int arr[])
	{
		int leftMulti = 0;
		int rightMulti = 1;
		
		for(int i=0;i<arr.length;i++)
		{
			rightMulti *= arr[i];
		}
		
		for(int i=0;i<arr.length;i++)
		{
			rightMulti /= arr[i];
			int temp = arr[i];
			arr[i] = leftMulti + rightMulti;
			if(leftMulti == 0)
			{
				leftMulti = 1;
			}
			leftMulti *= temp;
					
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		
		int arr[] = {5,7,4,3};
		ArrayElementReplace a=new ArrayElementReplace();
		/*int neww[]=a.call(arr);
		ArrayUtility.print(neww);*/
		ArrayUtility.print(a.replace(arr));
		
	}

	 int[] call(int[] arr) {
		 return replace(arr);
		
	}
}
