package ds.practice.array;

import java.util.List;

public class ArrayUtility {

	public static void print(int arr[])
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
		System.out.println();

	}
	
	public static void print(List<Integer> lst)
	{
		for(int i=0;i<lst.size();i++)
		{
			System.out.print(lst.get(i)+" ");
		}
		
		System.out.println();
	}
	
	public static int[] reverse(int arr[])
	{
		int start = 0;
		int end = arr.length-1;
		while(start<end)
		{
			arr[start] = arr[start] + arr[end];
			arr[end] = arr[start] - arr[end];
			arr[start] = arr[start] - arr[end];
			start++;
			end--;
		}
		return arr;
	}
	
	/*public static void main(String[] args) {
		
		int arr[] = {5,7,8,10};
		print(reverse(arr));
	}*/
}
