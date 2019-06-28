package ds.practice.others;

public class SqureRoot {
	
	
	public static int getSquqreRoot(int n)
	{
		int i=0;
		while(i<n)
		{
			if(i*i == n)
			{
				return i;
			}
			i++;
		}
		
		return -1;
	}
	
	public static int binarySearchSqrt(int n)
	{
		int start = 0;
		int end = n;
		int mid = 0;
		int midSqure;
		int count = 0;
		while(start<=end)
		{
			count++;
			mid = (start+end)/2;
			midSqure = mid*mid;
			if(midSqure == n)
			{
				return mid;
			}
			else if(midSqure < n)
			{
				start = mid+1;
			}
			else
			{
				end = mid-1;
			}
		}
		
		
		return -1;
	}

	
	public static void main(String[] args) {
		
		int n = 2048;
		int count = 0;
		int temp = n;
		while(true)
		{
		    temp = binarySearchSqrt(temp);
			if(temp < 0)
			{
				break;
			}
			count++;
		}
		System.out.println(count);
	}
}
