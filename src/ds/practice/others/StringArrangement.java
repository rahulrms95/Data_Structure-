package ds.practice.others;

public class StringArrangement {
	
	public int arrange(String str)
	{
		char[] sArr = str.toCharArray();
		int distance = 0;
		int curr = 0;
		int last = 0;
		int count = 0;
		boolean firstOcc = true;
		for(int i=0;i<sArr.length;i++)
		{
			count = 0;
			if(sArr[i] == 'R')
			{
				if(firstOcc)
				{
					firstOcc = false;
					count = curr-last;
					last = curr;
					curr = i;
					
				}
				else
				{
					last = curr;
					curr = i;
					count = curr-last;
					
				}
				
				if(count>0)
				{
					count = count-1 ;
				}
				
				//System.out.println(count);
				distance = distance +count;
			}
			
		}
		return distance;
	}

	public int swapString(String str)
	{
		char[] charArray = str.toCharArray();
		int aCount = 0;
		int bCount = 0;
		int numSwap = 0;
		for(int i=0;i<charArray.length;i++)
		{
			if(aCount >= 3 || bCount >= 3)
			{
				numSwap++;
				bCount = 0;
				aCount=0;
			}
			if(charArray[i] == 'a')
			{
				aCount = aCount+1;
				bCount = 0;
			}
			else
			{
				bCount = bCount+1;
				aCount=0;
			}
		}
		
		return numSwap;
	}
	public static void main(String[] args) {
		
		String str = "baabab";
		//System.out.println(new StringArrangement().arrange(str));
		System.out.println(new StringArrangement().swapString(str));
	}
}
