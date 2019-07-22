package ds.practice.algo;

import java.util.HashMap;

public class CoinProblem {
	
	static HashMap<String, Long> resultSet = new HashMap<>();
	static int count = 0;
	public static long count(int ar[],int i,int currentSum)
	{
		count++;
		if(ar.length <= i || 0>currentSum)
		{
			return 0;
		}
		if(currentSum==0)
		{
			return 1;
		}
		String key = i+""+currentSum;
		//System.out.println(key);
		if(resultSet.containsKey(key))
		{
			return resultSet.get(key);
		}
	   else
		{
			long result =  count(ar, i+1, currentSum) + count(ar, i, currentSum -ar[i]);
			resultSet.put(key, result);
			return result;
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		System.out.println(count(arr, 0, 10));
		
		System.out.println(count);
	}
}
