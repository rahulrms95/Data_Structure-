package ds.practice.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountSteps {

	static int count = 0;
	static Map<String,Long> map = new HashMap<>();
	static long countStep(int n,int steps,List<Integer> lst)
	{
		count++;
		if(steps>n)
		{
			return 0;
		}
		if(steps == n)
		{
			for(int i=0;i<lst.size();i++)
			{
				System.out.print(lst.get(i)+" ");
			}
			lst.clear();
			System.out.println();
			
			return 1;
		}
		String key = ""+n+steps+lst;
		if(map.containsKey(key))
		{
			return map.get(key);
		}
		else
		{
			long result =  countStep(n, steps+1,add(1, lst))+countStep(n, steps+2,add(2, lst));
			map.put(key, result);
			return result;
			
		}
	}
	
	static List<Integer> add(int n,List<Integer> ls)
	{
		ls.add(n);
		return ls;
	}
	
	public static void main(String[] args) {
		
		List<Integer> lst = new ArrayList<>();
		System.out.println(countStep(150, 0, lst));
		System.out.println(count);
	}
}
