
public class CandyDistribution {


	static int maxProofit(int arr[],int n)
	{
		int result = -1;

		for(int i=0;i<n;i++)
		{
			if(arr[i]>(i+1))
			{
				result += arr[i]-(i+1);
			}
			result++;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,4,6,34};
		System.out.println(maxProofit(arr, arr.length));
	}
}
