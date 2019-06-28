package ds.practice.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import ds.collection.list.ListUtiliy;

public class InsertionSort implements Sort<Integer>,Callable<Integer>{

	
	/**
	 * Insertion Sort
	 * **/
	
	
	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<>();
		
		lst.add(7);
		lst.add(9);
		lst.add(25);
		lst.add(44);
		lst.add(77);
		lst.add(9);
		lst.add(9);
		lst.add(12);
		lst.add(4);
		lst.add(5);
		lst.add(8);
		lst.add(9);
		InsertionSort bs = new InsertionSort();
		List<Integer> sortedLst = bs.sort(lst);
		
		ListUtiliy lu = new ListUtiliy();
		
		lu.print(sortedLst);
	
	}

	@Override
	public List<Integer> sort(List<Integer> lst) {
		// TODO Auto-generated method stub

		
		for(int i=1;i<lst.size();i++)
		{
			int num = lst.get(i);
			for(int j=0;j<i;j++)
			{
				if(lst.get(j)>num)
				{
					int temp = lst.get(j);
					int in = 0;
					while(in<=j)
					{
						lst.remove(j);
						lst.add(j, lst.get(j-1));
						in++;
					}
					break;
				}
			}
		}
		return lst;
	}

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
