package ds.practice.algo;

import java.util.HashSet;

public class AllSubString {

	static HashSet<String> strMap = new HashSet<>();
	static int count = 0;
	public static void printSubString(String str,int i,int j)
	{
		count++;
		if(i>str.length() || j>str.length())
		{
			return;
		}
		else
		{
			String temp = str.substring(i, j);
			//System.out.println(str.substring(i, j));
		    if(!strMap.contains(temp))
			{
				strMap.add(temp);
				printSubString(str, i, j+1);
				printSubString(str, i+1, j+1);
			}
		}
	}

	public static void main(String[] args) {

		printSubString("rahulkumar", 0, 0);
		System.out.println(strMap);
		System.out.println(count);
	}
}
