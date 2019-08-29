package com.interview.questions;

import java.util.Scanner;

public class WaterStorage {

	public static int waterStorage(int arr[])
	{
		int water = 0;

		for(int i=1;i<arr.length;)
		{
			int current = arr[i];
			int leftMaxIndex = -1;
			int j = i-1;
			int maxVal = current;
			// to find max value index in left side
			while(j>=0)
			{
				if(maxVal<arr[j])
				{
					maxVal = arr[j];
					leftMaxIndex = j;
				}
				j--;
			}

			// to find max value index in right side
			int rightMaxIndex = -1;
			j = i+1;
			maxVal = current;
			while(j<arr.length)
			{
				if(arr[j]>maxVal)
				{
					maxVal = j;
					rightMaxIndex = j;
				}
				j++;
			}
			/*if(rightMaxIndex >= arr.length-1 || leftMaxIndex >= arr.length-1)
			{
				break;
			}*/
			if(rightMaxIndex<0 || leftMaxIndex < 0)
			{
				i++;
				continue;
			}
			int minValue = Math.min(arr[leftMaxIndex],arr[rightMaxIndex]);
			for(int k = leftMaxIndex+1 ; k<rightMaxIndex;k++)
			{
				water += (minValue - arr[k]); 
			}
			i = rightMaxIndex;
		}

		return water;
	}


	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		/*System.out.println("Enter array size ");
		int n  = s.nextInt();
		int arr[] = new int[n];*/
		int arr1[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int arr2[] = {2,3,1,0,1,4};
		int arr3[] = {4,3,2};
		int arr4[] = {1,5,3,2,1,3,2,8};
		int arr5[] = {1,4,3,2,1,1,2,4,2,1,2};
		/*System.out.println("Enter Array Elements ");
		for(int i=0;i<n;i++)
		{
			arr[i] = s.nextInt();
		}*/
		System.out.println("Water Stored : "+waterStorage(arr5));
	}
}
