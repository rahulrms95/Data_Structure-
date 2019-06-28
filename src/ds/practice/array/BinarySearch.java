package ds.practice.array;

public class BinarySearch {

	public boolean binarySearch(int arr[],int start,int end,int numToSearch)
	{
		int mid;

		while(start<=end)
		{
			mid = (start+end)/2;
			if(arr[mid] == numToSearch)
			{
				return true;
			}
			else if(arr[mid] > numToSearch)
			{
				end = mid-1;
			}
			else
			{
				start = mid+1;
			}
		}
		return false;
	}
}
