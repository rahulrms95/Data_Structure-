package com.interview.questions;

import java.util.HashMap;
import java.util.Map;

public class RodCuttingProblem {


	static int count = 0;
	static Map<Integer,Integer> resultSet = new HashMap<>();
	public static int rodCutProblem(int n)
	{
		if(n==1)
		{
			return 0;
		}
		else
		{
			int minlength =0;
			minlength = n/2;

			return 1+rodCutProblem(minlength);
		}
	}
	
	public static int rodCut(int n)
	{
		int result = 0;
		boolean flag;
		
		for(int i=3;i<=n;i=i*2+1)
		{
			int temp = i;
			flag = true;
			while(temp != 3)
			{
			if(temp%2==0)
				{
					flag = false;
					break;
				}
				temp = temp/2;
			}
			if(flag)
			{
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println("Humara :: "+rodCutProblem(8));
		System.out.println("Begana :: "+rodCut(8));
		//977 543 252 979 348 889 876 55 938 610
		//System.out.println(count);
	}
}
