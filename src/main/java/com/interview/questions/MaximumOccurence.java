package com.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurence {


	static int maxOccurence(int arr[],int n)
	{
		int count = 0;
		int maxCount = 0;
		int minNum = Integer.MAX_VALUE;
		int prevMin = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			count = 0;
			for(int j=0;j<n;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count>=maxCount)
			{
				if(prevMin>arr[i])
				{
					
				}
				maxCount = count;
				minNum = arr[i];
				map.put(minNum, maxCount);
			}
		}
		System.out.println(map);
		System.out.println(minNum+" "+maxCount);
		return maxCount;
	}

	public static void main(String[] args) {

		int arr[] = {3,1,3,2,2,2,4,1,4,5,1};
		maxOccurence(arr, arr.length);
	}
}
