package com.practice.hackerrank;

import java.util.HashSet;
import java.util.Set;

public class Panagram {

	Set<Character> alphabet = new HashSet<>();
	
	public Panagram() {
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i=0;i<alpha.length();i++)
		{
			alphabet.add(alpha.charAt(i));
		}
		
	}
	
	public static String isPanagram(String str)
	{
		int[] alphabets = new int[128];
		str = str.toLowerCase();
		int count = 0;
		int i=0;
		while(i<str.length())
		{
			alphabets[(int)str.charAt(i)] = 1;
			i++;
		}
		for(i=97;i<123;i++)
		{
			if(alphabets[i]<=0)
			{
				return "Not Panagram";
			}

		}
		return "Panagram";
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPanagram("We promptly judged antique ivory buckles for the next prize"));
	}
}
