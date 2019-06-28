package ds.practice.array;

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
}
