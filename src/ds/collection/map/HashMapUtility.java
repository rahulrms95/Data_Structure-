package ds.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapUtility {

	
	private Map<String,Integer> map;
	
	public HashMapUtility() {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
	}
	
	public static void main(String[] args) {
		
		HashMapUtility hm = new HashMapUtility();
		
		hm.map.put("abc", 1);
		hm.map.put("FB", 2);
		hm.map.put("Ea", 3);
		System.out.println("FB".hashCode()+" "+"Ea".hashCode());
		hm.map.get("FB");
	}
}
