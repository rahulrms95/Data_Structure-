package ds.practice.sorting;

import java.util.ArrayList;
import java.util.List;

import ds.collection.list.ListUtiliy;

public class BubbleSort implements Sort<Integer>{


	/**
	 * Bubble sort  
	 * **/

	@Override
	public List<Integer> sort(List<Integer> lst) {
		// TODO Auto-generated method stub

		List<Integer> sortedLst = new ArrayList<Integer>();
		int length = lst.size();
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length-i-1;j++)
			{
				if(lst.get(j)>lst.get(j+1))
				{
					int temp = lst.get(j);
					int next =lst.get(j+1);
					lst.remove(j);
					lst.add(j,next);
					lst.remove(j+1);
					lst.add(j+1,temp);
				}
			}
		}
		return lst;
	}

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
		BubbleSort bs = new BubbleSort();
		List<Integer> sortedLst = bs.sort(lst);

		ListUtiliy lu = new ListUtiliy();

		lu.print(sortedLst);
	}
}
