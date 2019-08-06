package com.interview.questions;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ds.practice.number.NumberUtility;

public class MaxinumDigitSubSequence {

	static int maxDigits(int arr[],int n)
	{
		int resultCount = 0;

		Map<Integer, Integer> maxCountMap = new HashMap<>();
		int[] digits;
		for(int i=0;i<n;i++)
		{
			digits = NumberUtility.toDigitArray(arr[i]);
			for(int j=0;j<10;j++)
			{
				if(search(digits,j))
				{
					if(maxCountMap.containsKey(j))
					{
						maxCountMap.put(j, maxCountMap.get(j)+1);
					}
					else
					{
						maxCountMap.put(j, 1);
					}
				}
			}
		}
		System.out.println(maxCountMap);
		Set<Entry<Integer, Integer>> set = maxCountMap.entrySet();
		for(Entry<Integer, Integer> entry:set)
		{
			if(resultCount<entry.getValue())
			{
				resultCount = entry.getValue();
			}
		}
		return resultCount;
	}

	static boolean search(int arr[],int num)
	{
		int start = 0;
		int end = arr.length-1;
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(arr[mid] == num)
			{
				return true;
			}
			else if(arr[mid]>num)
			{
				end--;
			}
			else
			{
				start++;
			}
		}
		return false;
	}
	public static void main(String[] args) {

		// 12,11,22,24,15,18
		int arr[] = {12442,5343,54563,777888,12245};
		System.out.println(maxDigits(arr, arr.length));
	}
}
