package oops.concept.exception;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class MainException {

	
	public MainException() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		try {
		devision(a, b);
		}
		catch(Exception e)
		{
			System.out.println(((CustomUnCheckedException) e).getError());
		}
		
	}
	
	static int devision(int a,int b)
	{
		Map<String, String> obj = new HashMap<String, String>();
		new TreeMap<>();
		new LinkedHashMap<>();
		new Hashtable<>();
		
		new LinkedList<>();
		try
		{
			return a/b;
		}
		catch(RuntimeException ce)
		{
			try {
				throw new CustomUnCheckedException("Devide by zero Excpetion",ce,"This is device by zero exception");
			} catch (CustomUnCheckedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return b;
	}
}
