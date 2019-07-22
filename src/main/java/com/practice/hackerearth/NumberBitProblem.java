package com.practice.hackerearth;

public class NumberBitProblem {

	
	static int getNumber(long num1)
	{
		int num2 = 1;
		
		while(num1>0)
		{
			long temp = num1%2;
			if(temp==1)
			{
				num2 = num2<<1;
				num1 = num1/2;
			}
			else
			{
				break;
			}
		}
		return num2;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getNumber(11));
		
	}
}
