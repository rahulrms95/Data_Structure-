import ds.practice.array.ArrayUtility;

public class MergeSort {


	static int[] sort(int arr[],int start,int end)
	{
		int result[] = null;
		if(start<end)
		{
			int mid = (start+end)/2;
			sort(arr, start, mid);
			sort(arr,mid+1,end);
			merge(arr,start,mid,end);
		}

		return result;
	}

	static int[] merge(int arr[],int start,int mid,int end)
	{
		int left[] = new int[mid-start+1];
		int right[] = new int[end-mid+1];
		for(int i=start;i<left.length;i++)
		{
			left[i-start] = arr[i];
		}
		
		for(int i=mid;i<right.length;i++)
		{
			right[i-mid] = arr[i];
		}

		int s1=0,s2=0;
		int k =0;
		while(s1<left.length && s2<right.length)
		{
			if(left[s1] > right[s2])
			{
				arr[k] = right[s2];
				s2++;
			}
			else
			{
				arr[k] = left[s1];
				s1++;
			}
			k++;
		}
		
		while(s1<left.length)
		{
			arr[k] = left[s1];
			s1++;
		}
		
		while(s2<right.length)
		{
			arr[k] = right[s2];
			s2++;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,15,9,2,8};
		sort(arr,0, arr.length);
		ArrayUtility.print(arr);
	}
}
