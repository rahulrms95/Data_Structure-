package ds.practice.string;

public class MinMaxCount {

	public static int[] result(int scores[])
	{
			int minScore = scores[0];
			int maxScore = scores[0];
			int minCount = 0;
			int maxCount = 0;
	
			for(int i=1;i<scores.length;i++)
			{
				if(scores[i]<minScore)
				{
					minScore = scores[i];
					minCount++;
				}
				if(scores[i]>maxScore)
				{
					maxScore = scores[i];
					maxCount++;
				}
			}
			int result[] = {maxCount,minCount};
			return result;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {3,4,21,36,10,28,35,5,24,42};
		int[] result = result(arr);
		System.out.println(result[0]+" "+result[1]);
	}
}
