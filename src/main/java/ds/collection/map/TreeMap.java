package ds.collection.map;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;

public class TreeMap implements Comparator<HashMapSize>{

	
	public static void main(String[] args) {
		
		java.util.TreeMap<String, Integer> map = new java.util.TreeMap<>();
		map.put("abc", 2);
		map.put("def", 1);
		
		
		Set<Entry<String, Integer>> set = map.entrySet();
		Set<String> keyset = map.keySet();
		for(Entry<String, Integer> entry : set)
		{
			
		}
		
	}

	@Override
	public int compare(HashMapSize o1, HashMapSize o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
