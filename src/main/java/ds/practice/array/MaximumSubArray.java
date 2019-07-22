package ds.practice.array;

public class MaximumSubArray {

	
	public static int maxSubArray(int arr[])
	{
		int maxSum_sofar = 0;
		int currentSum = 0;
		for(int i=0;i<arr.length;i++)
		{
			currentSum += arr[i];
			if(currentSum>maxSum_sofar)
			{
				maxSum_sofar = currentSum;
			}
			if(currentSum<0)
			{
				currentSum = 0;
			}
		}
		return maxSum_sofar;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		System.out.println(maxSubArray(arr));
		
	}
}
