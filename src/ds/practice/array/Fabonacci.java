package ds.practice.array;

public class Fabonacci {

	
	public int[] createFabSeries(int n)
	{
		int first = 0,second = 1,index =0 ;
		int arr[] = new int[n];  
		arr[index++] = first;
		arr[index++] = second;
		int next = -1 ;
		
		while(n>index)
		{
			next = first + second;
			arr[index++] = next;
			first = second;
			second = next;
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		
		Fabonacci fab = new Fabonacci();
		
		int arr[] = fab.createFabSeries(5);
		ArrayUtility utility = new ArrayUtility();
		
		utility.print(arr);
		
	}
}
