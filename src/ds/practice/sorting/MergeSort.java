package ds.practice.sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sort<Integer>{

	@Override
	public List<Integer> sort(List<Integer> lst) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Integer> mergeSortedList(List<Integer> lst1, List<Integer> lst2)
	{
		List<Integer> mergedList = new ArrayList<>();
		int len1 = lst1.size()-1;
		int len2 = lst2.size()-1;
		int start1 = 0;
		int start2 = 0;
		while(len1 >= start1 && len2 >= start2)
		{
			if(lst1.get(start1) < lst2.get(start2))
			{
				mergedList.add(lst1.get(start1));
				start1++;
			}
			else
			{
				mergedList.add(lst2.get(start2));
				start2++;
			}
		}
		while(start1 < len1)
		{
			mergedList.add(lst1.get(start1));
			start1++;
		}
		while(start2 < len2)
		{
			mergedList.add(lst2.get(start2));
			start2++;
		}
		return mergedList;
	}

}



















