package com.practice.hackerrank;

public class ChocolateFeast {

	
	public static int countChocolate(int totalM,int cost,int wrapper)
	{
		int totalChocolate = totalM/cost;
		int remainWrapper = totalChocolate;
		int moreChoco;
		while(remainWrapper>=wrapper)
		{
			moreChoco = remainWrapper/wrapper;
			remainWrapper = remainWrapper%wrapper;
			remainWrapper += moreChoco;
			totalChocolate += moreChoco;
		}
		
		return totalChocolate;
	}
	
	public static void main(String[] args) {
		
		System.out.println(countChocolate(10,2,5));
	}
}
