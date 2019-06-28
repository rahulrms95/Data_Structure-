package ds.practice.array;

public class RotatedArray {

	int size;
	int array[]; 
	
	public RotatedArray(int size)
	{
		this.size = size;
		array =new int[size];
	}
	
	public static void main(String[] args) {

		RotatedArray ra = new RotatedArray(12);
		
		ArrayUtility utility = new ArrayUtility();
		//utility.hashCode();
	///	utility.print(ra.array);
		
	/*	System.out.println(ra.getClass().getName()+"@"+Integer.toHexString(ra.hashCode()));
		System.out.println(ra.toString());*/
		
		ra.array[0] = 20;
		ra.array[1] = 22;
		ra.array[2] = 24;
		ra.array[3] = 25;
		ra.array[4] = 2;
		ra.array[5] = 6;
		ra.array[6] = 10;
		ra.array[7] = 12;
		ra.array[8] = 14;
		ra.array[9] = 16;
		ra.array[10] = 17;
		ra.array[11] = 19;
		
	
		System.out.println(ra.searchElement(ra.array, 0, ra.array.length, 25));
	}
	
	public boolean foundElement(int numToBeFound)
	{
		boolean isPresent = false;
		return isPresent;
	}
	
	public boolean searchElement(int []arr, int start,int end,int search)
	{
		if(start>end)
		{
			return false;
		}
		int mid = (start+end)/2;
		
		if(arr[mid] == search)
		{
			return true;
		}
		else if(arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1])
		{
			return searchElement(arr, start, mid-1, search) || searchElement(arr, mid+1, end, search);
		}
		else if(arr[mid] > search)
		{
			return searchElement(arr, start, mid-1, search);
		}
		else if(arr[mid] < search)
		{
			return searchElement(arr, mid+1, end, search);
		}
		return false;
	}
}
