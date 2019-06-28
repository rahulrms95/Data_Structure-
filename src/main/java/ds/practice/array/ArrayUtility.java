package ds.practice.array;

import java.util.List;

public class ArrayUtility {

	public void print(int arr[])
	{
		if(arr != null && arr.length>0)
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
		else
		{
			System.out.print("Array/Series is null or Size of Array is zero");
		}

	}
	
	public void print(List<Integer> lst)
	{
		for(int i=0;i<lst.size();i++)
		{
			System.out.print(lst.get(i)+" ");
		}
	}
}
