package ds.practice.sorting;

import java.util.ArrayList;
import java.util.List;

import ds.practice.array.ArrayUtility;

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


	public void sort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int mid = (low+high)/2;
			sort(arr,low,mid);
			sort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}

	private void merge(int arr[],int low,int mid,int high)
	{
		int n1  = mid-low+1;
		int n2 = high-mid;
		int left[] = new int[n1];
		int right[] = new int[n2];

		for(int i=0;i<left.length;i++)
		{
			left[i] = arr[i+low];
		}
		for(int i=0;i<right.length;i++)
		{
			right[i] = arr[i+mid+1];
		}

		int start1 = 0;
		int start2 = 0;
		int start = low;
		while(start1<left.length && start2<right.length)
		{
			if(left[start1]<right[start2])
			{
				arr[start] = left[start1];
				start1++;
			}
			else
			{
				arr[start] = right[start2];
				start2++;
			}
			start++;
		}

		while(start1<left.length )
		{
			arr[start] = left[start1];
			start1++;
			start++;
		}

		while(start2<right.length)
		{
			arr[start] = right[start2];
			start2++;
			start++;
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,14,22,4,5,2,8,10,3,44,12,35};
		
		new MergeSort().sort(arr, 0, arr.length-1);
		
		ArrayUtility.print(arr);
	}
}



















