package ds.practice.others;

public class MaximumChain {

		
	public static int maximumChain(int arr[])
	{
		int maxCount = 0;
		int curCount = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			int j = arr[i];
			curCount = 0;
			while(true)
			{
				if(i == j || arr[j] == j)
				{
					break;
				}
				j = arr[j];
				curCount++;
			}
			if(curCount > maxCount)
			{
				maxCount = curCount;
			}
		}
		
		return maxCount;
	}
	
	
	public static void main(String[] args) {
		
	}
}
