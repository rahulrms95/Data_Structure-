package ds.practice.string;

import java.util.HashMap;
import java.util.Map;

public class DistancebtwWords {

	
	public int distanceBtwWord(String str,String str1,String str2)
	{
		int distance = 0;
		String[] strArray = str.split(" ");
		Map<String,Integer> strMap = new HashMap<>();
		
		for(int i=0;i<strArray.length;i++)
		{
			strMap.put(strArray[i],i);
		}
		
		System.out.println(strMap);
		
		if(strMap.containsKey(str1) && strMap.containsKey(str2))
		{
			distance = strMap.get(str1)- strMap.get(str2);
			if(distance<0)
			{
				distance=-distance;
			}
		}
		return --distance;
	}
	
	public static void main(String[] args) {
		
		String str1 = "geeks for geeks contribute practice",w1 = "geeks", w2 = "practice";
		
		String str2 = "the quick the brown quick brown the frog",w3 = "quick", w4 = "frog";
		
		System.out.println(new DistancebtwWords().distanceBtwWord(str1, w1, w2));
		System.out.println(new DistancebtwWords().distanceBtwWord(str2, w3, w4));
		
	}
}
