package ds.practice.sorting;

public class QuickSort {

	private int partition(int arr[],int pivot,int i)
	{
		int j = 0;
		Object obj;
		try {
			boolean is = Class.forName("ds.practice.sorting.QuickSort").isInstance(new Object());
			System.out.println(is);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return j;
	}

	public void sort(int arr[],int low,int high)
	{
		for(int i=0;i<arr.length;i++)
		{
			int pivot  = arr[high];
			partition(arr, pivot, i);
		}
	}
	
	public static void main(String[] args) {
		QuickSort sort = new  QuickSort();
		int arr[] = {3,6,2,5,8,7};
		sort.partition(arr, 1, 0);
	}
}
