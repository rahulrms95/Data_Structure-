package com.interview.questions;

public class MinDiffNumbers {

	
	
	public static void main(String[] args) {
		int nums [] = {4,5,2,6,8,9};
		print(getMinDifNumber(nums));
	}
	public static int[][] getMinDifNumber(int nums[])
	{
		int result [][] = new int[nums.length][2];
		
		int minDiff = Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums.length;j++)
			{
				if(i!= j)
				{
					if(minDiff > Math.abs(nums[i]-nums[j]))
					{
						minDiff = Math.abs(nums[i]-nums[j]);
					}
				}
			}
		}
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums.length;j++)
			{
				if(i!= j)
				{
					if(minDiff == Math.abs(nums[i]-nums[j]))
					{
						result[i][0] = nums[i];
						result[i][1] = nums[j];
					}
				}
			}
		}
		return result;
	}
	
	public int[][] getMinDiffArray(int arr[])
	{
		int result [][] = new int[arr.length][2];
		
		return result;
	}
	
	public static void print(int arr[][])
	{
		
		int row = arr.length;
		int col = arr[0].length;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}

