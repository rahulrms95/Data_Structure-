package com.practice.hackerrank;

public class HackerRankMatch {

	static String hackerrankInString(String s) {
		s = s.toLowerCase();
		String hack = "hackerrank";
		if(s.length() < hack.length())
		{
			return "NO";
		}
		int start=0;
		int i;
		boolean isCharFound ;
		for(i=0;i<hack.length();i++)
		{
			char ch = hack.charAt(i);
			if(start == s.length())
			{
				return "NO";
			}
			isCharFound = false;
			while(start<s.length())
			{
				if(s.charAt(start) == ch)
				{
					isCharFound = true;
					start++;
					break;
				}
				start++;
			}
			if(!isCharFound)
			{
				return "NO";
			}

		}
		if(i == hack.length())
		{
			return "YES";
		}
		return "NO";
	}

	public static void main(String[] args) {

		System.out.println(hackerrankInString("rhackerank"));
		/*System.out.println(hackerrankInString("knarrekcah"));
		System.out.println(hackerrankInString("hackerrank"));
		System.out.println(hackerrankInString("hackeronek"));
		System.out.println(hackerrankInString("abcdefghijklmnopqrstuvwxyz"));
		System.out.println(hackerrankInString("rhackerank"));
		System.out.println(hackerrankInString("ahankercka"));
		System.out.println(hackerrankInString("hacakaeararanaka"));
		System.out.println(hackerrankInString("hhhhaaaaackkkkerrrrrrrrank"));
		System.out.println(hackerrankInString("crackerhackerknar"));
		System.out.println(hackerrankInString("hhhackkerbanker"));*/
		

	}

}
