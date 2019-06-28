package ds.practice.others;

import java.util.Hashtable;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String, Integer> table = new Hashtable<>();
		table.put("rahul", 1302);
		int arr[] = {200,300,400,500,1200,1400,150,120,180};
		
		for(int i =0;i<arr.length;i++)
		{
			float temp =  (arr[i]/100);
			//System.out.println(temp);
		}
		
		int x =40;
		int y =x;
		x++;
		System.out.println(x+" "+y);
		System.out.println(x==y);
	}


}
