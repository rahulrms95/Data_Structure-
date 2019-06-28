package ds.practice.sorting;

import java.util.ArrayList;
import java.util.List;

import ds.collection.list.ListUtiliy;

public class SelectionSort implements Sort<Integer>{

	@Override
	public List<Integer> sort(List<Integer> lst) {
		// TODO Auto-generated method stub
		//int startIndex=0;
		int smallElementIndex=0;
		for(int i =0;i<lst.size();i++)
		{
			for(int j=i;j<lst.size();j++)
			{
				if(lst.get(smallElementIndex)>lst.get(j))
				{
					smallElementIndex = j;
				}
			}
			
			int temp = lst.get(i);
			int smallElement = lst.get(smallElementIndex);
			lst.remove(i);
			lst.add(i,smallElement);
			lst.remove(smallElementIndex);
			lst.add(smallElementIndex,temp);
			smallElementIndex=0;
		}
		return lst;
	}

	
	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<>();
		
		lst.add(2);
		lst.add(9);
		lst.add(-25);
		lst.add(44);
		lst.add(77);
		lst.add(1);
		lst.add(2);
		lst.add(12);
		lst.add(4);
		lst.add(5);
		lst.add(8);
		lst.add(3);
		SelectionSort bs = new SelectionSort();
		List<Integer> sortedLst = bs.sort(lst);
		
		ListUtiliy lu = new ListUtiliy();
		
		lu.print(sortedLst);
		
		String ss = "";
	
	}
}
