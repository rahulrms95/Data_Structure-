package ds.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedList implements Runnable{

	List<String> str;

	public SynchronizedList()
	{
		str = Collections.synchronizedList(new ArrayList<String>());
	}
	
	public String remove()
	{
		if(!str.isEmpty())
		{
			return str.remove(0);
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		SynchronizedList sl = new SynchronizedList();
		for(int i=0;i<50;i++)
		{
			sl.add(String.valueOf(i));
		}
		
		sl.remove();
		
	}
	
	public void add(String s)
	{
		str.add(s);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		remove();
	}
}
