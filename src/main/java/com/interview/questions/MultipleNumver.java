package com.interview.questions;


import java.util.*;

class MultipleNumver {
	public static void main(String args[] ) throws Exception {

		Scanner s = new Scanner(System.in);
		int test = s.nextInt();                
		System.out.println(result(test));
	}

	static int result(int n)
	{
		int result[] = new int[(""+n).length()+1];

		int devider = 9;
		int i=0;
		while(n>=1)
		{
			if(n%devider==0)
			{
				result[i] = devider;
				if(n==1)
				{
					n=0;
				}
				else
				{
					n = n/devider;
					devider = 9;
					i++;
				}

			}
			else
			{
				devider--;
			}
		}
		int size =result.length;
		Arrays.sort(result);
		String ss = "";
		for(int j=0;j<result.length;j++)
		{
			ss = ss+result[j];
		}
		return Integer.valueOf(ss);
	}
}
