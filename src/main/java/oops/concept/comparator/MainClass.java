package oops.concept.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ds.collection.list.ListUtiliy;

public class MainClass {
	
	
	public MainClass() {}
	
	
	public static void main(String[] args) {

		// TODO Auto-generated constructor stub
		List<Book> lst = new ArrayList<>();
		
		lst.add(new Book("sde", 3));
		lst.add(new Book("for", 5));
		lst.add(new Book("war", 3));
		lst.add(new Book("abc", 2));
		lst.add(new Book("aabc", 3));
		lst.add(new Book("xvf", 7));
		lst.add(new Book("def", 1));
		
		Collections.sort(lst,new SortBook());
		new MainClass().print(lst);;
	
	}
	
	public void print(List<Book> lst)
	{
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i).name+" "+lst.get(i).count);
		}
	}

}
