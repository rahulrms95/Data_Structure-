package com.interview.questions;

public class EquiliberiumOfArray {

	static int indexOfEquili(int arr[])
	{
		int index = 0;
		int start = 0;
		int end = arr.length-1;
		int leftSum = 0;
		int rightSum = 0;
		while(start<end)
		{
			if(leftSum == rightSum)
			{
				leftSum += arr[start++];
				rightSum += arr[end--];
			}
			else if(leftSum>rightSum)
			{
				rightSum += arr[end--];
			}
			else
			{
				leftSum += arr[start++];
			}
		}
		return leftSum==rightSum?start:-1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {3,2,6,-4,1,6,2,-2};
		System.out.println(indexOfEquili(arr));
	}
}
