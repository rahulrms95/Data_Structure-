package com.interview.questions;

public class MaxiMumOccurCharacter {

	
	public static char getMaxOccuringChar(char arr[])
	{
		int maxOccured = 0 ;
		
		int totalChar[] = new int[128];
		
		for(int i=0;i<arr.length;i++)
		{
			 char ch = Character.toLowerCase(arr[i]);
			totalChar[(int)ch] = (totalChar[(int)ch]+1);
		}
		int maxCount = 0;
		for(int i=0;i<totalChar.length;i++)
		{
			if(maxCount<totalChar[i])
			{
				maxCount = totalChar[i];
				maxOccured = i;
			}
		}
		return (char)maxOccured;
	}
	
	public static void main(String[] args) {
		
		String str = "heLlo world";
		System.out.println(getMaxOccuringChar(str.toCharArray()));
		
	}
}
