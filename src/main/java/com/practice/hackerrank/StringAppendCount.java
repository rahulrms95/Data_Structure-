package com.practice.hackerrank;

public class StringAppendCount {

	
	public static void main(String[] args) {
		
		System.out.println(aCount("aba", 10));
	}
	
	public static long aCount(String str,long n)
	{
		long result = 0;
		int i=0;
		long count = 0;
		while(i<str.length())
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'A')
			{
				count++;
			}
			i++;
		}
		
		if(count == 0)
		{
			return count;
		}
		else
		{
			long nCount = n/str.length();
			result = count*nCount;
			if(n%str.length() == 0)
			{
				return result;
			}
			else
			{
				long remainCount = (n%str.length())-1;
				while(remainCount >= 0)
				{
					if(str.charAt((int)remainCount) == 'a' || str.charAt((int)remainCount) == 'A')
					{
						result++;
					}
					remainCount--;
				}
			}
		}
		return result;
	}
}
