package com.practice.hackerrank;

public class TimeProblem {


	public static String convertTime(String str)
	{
		StringBuffer result = new StringBuffer();
		String[] splitStr = str.split(":");
		int hour = Integer.valueOf(splitStr[0]);
		char[] lastArr = splitStr[2].toCharArray();
		char[] secArr = {lastArr[0],lastArr[1]};
		if(str.charAt(str.length()-2)=='P' || str.charAt(str.length()-2)=='p')
		{
			hour = Integer.valueOf(splitStr[0]);
			if(hour>=12)
			{
				hour = 0;
			}
			hour = hour+12;
		}
		if(str.charAt(str.length()-2)=='A' || str.charAt(str.length()-2)=='a')
		{
			if(hour==12)
			{
				hour = 0;
			}
		}
		if(hour<10)
		{
			result.append("0"+hour+":");
		}
		else
		{
			result.append(hour+":");
		}
		result.append(splitStr[1]+":");
		result.append(secArr);
		System.out.println(result.toString());
		return result.toString();
	}

	public static void main(String[] args) {

		convertTime("12:59:45AM");

	}
}

