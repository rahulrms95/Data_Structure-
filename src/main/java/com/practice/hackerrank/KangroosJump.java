package com.practice.hackerrank;

public class KangroosJump {

	
	
	public static void main(String[] args) {
	
		System.out.println(isJumpPossible(0, 2, 5, 3));

	}
	
	public static String isJumpPossible(int st1,int v1,int st2,int v2)
	{
		int dis1 = st1;
		int dis2 = st2;
		
		boolean flag = false;
		if(st1>st2)
		{
			flag = true;
		}
		while(dis1!=dis2)
		{
			if(flag)
			{
				if(dis2>dis1)
				{
					return "No";
				}
			}
			else if(!flag)
			{
				if(dis1>dis2)
				{
					return "No";
				}
			}
			dis1 += v1;
			dis2 += v2;
		}
		if(dis1==dis2)
		{
			return "Yes";
		}
		return "No";
	}
}
