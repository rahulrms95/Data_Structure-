package com.interview.questions;

public class IsPlindromePossible {

	
	static boolean isPossible(String str)
	{
		int alpha[] = new int[128];
		for(int i=0;i<str.length();i++)
		{
			alpha[(int)str.charAt(i)] = alpha[(int)str.charAt(i)]+1;
		}
		
		boolean isEven = false;
		if(str.length()%2==0)
		{
			isEven = true;
		}
		int oddCount=0;
		for(int i=0;i<alpha.length;i++)
		{
			if(alpha[i]%2!=0)
			{
				oddCount++;
			}
		}
		return isEven?oddCount==0:oddCount==1;
	}
	
	public static void main(String[] args) {
		
		String str ="acca";
		System.out.println(isPossible(str));
	}
}
