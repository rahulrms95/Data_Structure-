package ds.practice.others;

import java.util.ArrayList;
import java.util.List;

import ds.collection.list.ListUtiliy;

public class Fabonacci {

	
	public List<Integer> fabonacciSeries(int size)
	{
		List<Integer> fabSeries = new ArrayList<>();
		int n1 = 0;
		int n2 = 1;
		fabSeries.add(n1);
		fabSeries.add(n2);
		size = size -2;
		int num = 0;
		while(size>0)
		{
			num = n1 + n2;
			fabSeries.add(num);
			n1 = n2;
			n2 = num;
			size--;
		}
		return fabSeries;
	}
	
	public static void main(String[] args) {
		
		List<Integer> series = new Fabonacci().fabonacciSeries(15);
		ListUtiliy lu = new ListUtiliy();
		
		lu.print(series);
	}
}
