package com.interview.questions;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RunningMedian {

	static Set<Integer> num;
	
	public RunningMedian()
	{
		num = new TreeSet();
	}
	public static int getMedian(int n)
	{
		num.add(n);
		Iterator<Integer> iterator = num.iterator();
		int median = 0;
		int i = 0;
		boolean flag = false;
		System.out.println(num.size());
		if(num.size()%2==0 && num.size()>1)
		{
			i = num.size()/2;
			flag = true;
		}
		else
		{
			i = num.size()/2;
		}
		
		int count = 0;
		while(iterator.hasNext())
		{
			int temp = iterator.next();
			if(flag)
			{
				if(count == i || count == i-1)
				{
					median += temp;
				}
			}
			else
			{
				if(count == i)
				{
					median += temp;
				}
			}
			count++;
		}
		System.out.println(num);
		return median;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		new RunningMedian();
		while(true)
		{
			int num = s.nextInt();
			System.out.println("Median : "+getMedian(num));
		}
	}
}
