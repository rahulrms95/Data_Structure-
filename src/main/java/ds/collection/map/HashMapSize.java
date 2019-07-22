package ds.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapSize {

	Map<String,Integer> map;
	
	public HashMapSize()
	{
		map = new HashMap<>();
	}
	
	public void add(String str,int n)
	{
		map.put(str, n);
	}
	
	public static void main(String[] args) {

		HashMapSize hms = new HashMapSize();

		int arr[] = new int[50];
		for(int i=0;i<50;i++)
		{
			hms.add("rahul"+i, 1302);
			arr[i] =i+4;
		}
	
	}
}
