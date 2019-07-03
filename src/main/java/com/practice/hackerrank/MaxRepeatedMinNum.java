package com.practice.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MaxRepeatedMinNum {

	public static int getMinRepeated(List<Integer> arr)
	{
		Map<Integer,Integer> values = new HashMap<Integer,Integer>();

		for(int i=0;i<arr.size();i++)
		{
			if(values.containsKey(arr.get(i)))
			{
				values.put(arr.get(i), values.get(arr.get(i))+1);
			}
			else{
				values.put(arr.get(i), 1);
			} 
		}
		System.out.println(values);
		Set<Entry<Integer, Integer>> entrySet = values.entrySet();
		int minRepeatedValue = 9999999;
		int[] minValue = new int[1];

		int maxCount = -9999999;
		for(Entry<Integer, Integer> entry : entrySet)
		{
			if(entry.getValue()>maxCount)
			{
				minRepeatedValue = entry.getKey();
				maxCount = entry.getValue();
			}
		}

		return minRepeatedValue;
	}

	public static void main(String[] args) {

		int arr[] = {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4,4,3};

		List<Integer> lst = new ArrayList<>();

		for(int i=0;i<arr.length;i++)
		{
			lst.add(arr[i]);
		}

		System.out.println(getMinRepeated(lst));
	}
}
