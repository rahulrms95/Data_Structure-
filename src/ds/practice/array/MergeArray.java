package ds.practice.array;

import java.util.Arrays;

public class MergeArray {

	public static int[] mergeArray(int arr1[],int arr2[])
	{
		int len1 = arr1.length;
		int len2 = arr2.length;
		int mergeArray[] = new int[len1+len2];

		int st1 = 0;
		int st2 = 0;
		int st = 0;
		while(st1<len1 && st2 < len2)
		{
			if(arr1[st1]<arr2[st2])
			{
				mergeArray[st] = arr1[st1];
				st1++;
			}
			else 
			{
				mergeArray[st] = arr2[st2];
				st2++;
			}
			st++;
		}

		while(st1<len1)
		{
			mergeArray[st] = arr1[st1];
			st1++;
			st++;
		}

		while(st2<len2)
		{
			mergeArray[st] = arr2[st2];
			st2++;
			st++;
		}


		return mergeArray;
	}


	public static void main(String[] args) {

		int[] arr1 = {-1,1,3,5,7,9};
		int[] arr2 = {-2,2,3,4,5,6};

		int[] result = mergeArray(arr1, arr2);
		//Arrays.
		print(result);
	}

	public static void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
