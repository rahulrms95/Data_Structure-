package ds.practice.string;

import java.util.HashSet;
import java.util.Set;

public class PermutationString {

	String s;
	static int count = 0;
	public void printAllPermutation(String str,int l,int r)
	{
		if(l==r)
		{
			count++;
			System.out.println(str);
		}
		else
		{
			for(int i=l;i<r;i++)
			{
				s = swap(str, i, l);
				printAllPermutation(s, l+1, r);
				s = swap(str, l, i);
			}

		}
	}

	public String swap(String str,int i,int j)
	{
		char arr[]	= str.toCharArray();

		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		return String.valueOf(arr);
	}

	public static void main(String[] args) {

		PermutationString ps = new PermutationString();

		//	ps.printAllPermutation("rahul", 0,5);
		//	System.out.println(ps.count);
		//System.out.println(ps.swap("rahul", 2,3));
		printPremutations("rahul","");
		//	System.out.println(permu);
		System.out.println(permu.size());
		System.out.println(count);
	}
	static Set<String> permu = new HashSet<>();
	static void printPremutations(String str,String patt)
	{
		count++;
		if(patt.length()==str.length())
		{
			permu.add(patt);
			System.out.println(patt);
			return;
		}
		for(int j=0;j<str.length();j++)
		{
			if(!patt.contains(""+str.charAt(j)))
			{
				printPremutations(str, patt+str.charAt(j));
			}
		}
	}
}
