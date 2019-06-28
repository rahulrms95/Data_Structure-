package com.interview.questions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;



public class Solution {
	public static void main(String[] args) throws IOException {

		// Math English History Hindi Economics Physics Bio
		int Math = 3;
		int English = 3;
		int Physics = 2;
		int History = 4;
		int Hindi = 4;
		int totalBooks = 1;
		List<String> bookTitles = new ArrayList<>();
		for(int i=0;i<totalBooks;i++)
		{
			while(Math>0)
			{
				bookTitles.add("Math");
				Math--;
			}
			while(Hindi>0)
			{
				bookTitles.add("Hindi");
				Hindi--;
			}
			while(English>0)
			{
				bookTitles.add("English");
				English--;
			}
			while(Physics>0)
			{
				bookTitles.add("Physics");
				Physics--;
			}
			while(History>0)
			{
				bookTitles.add("History");
				History--;
			}
		}
		int bookShelfRows = 5;
		int bookShelfCols = 5;
		//  new Solution().printBookSorted(bookTitles,bookShelfRows,bookShelfCols);

		new Solution().printUsingComparator(bookTitles,bookShelfRows,bookShelfCols);
	}

	public void printBookSorted(List<String> lst, int row,int col)
	{
		TreeMap<String,Integer> map;

		map = sortTitles(lst,row,col);
		//System.out.print(map.entrySet());

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		int mapSize = 1;
		for(Entry<String, Integer> entry : entrySet)
		{
			int numCopy = 1;
			while(numCopy<=entry.getValue())
			{
				if(numCopy == entry.getValue())
				{
					System.out.print(entry.getKey());
				}
				else
				{
					System.out.print(entry.getKey()+",");
				}

				numCopy++;
			}

			if(mapSize != map.size())
				System.out.print(",");
			mapSize++;
		}



	}

	public TreeMap<String,Integer> sortTitles(List<String> lst, int row,int col)
	{
		TreeMap<String,Integer> result = new TreeMap<>();
		for(int i=0;i<lst.size();i++)
		{
			if(result.containsKey(lst.get(i)))
			{
				result.put(lst.get(i),result.get(lst.get(i))+1);
			}
			else
			{
				result.put(lst.get(i),1);
			}
		}
		//  System.out.print(result);
		return result;
	}

	public void printUsingComparator(List<String> lst, int row,int col)
	{
		TreeMap<String,Integer> map;
		// System.out.print(lst.size());
		map = sortTitles(lst,row,col);
		//System.out.print(map.entrySet());
		List<Book> books = new ArrayList<>();
		Set<Entry<String, Integer>> entrySet = map.entrySet();

		// System.out.print(map.size());
		int rowStart=0;
		int colStart=0;
		for(Entry<String, Integer> entry : entrySet)
		{
			int bookCount = entry.getValue();
			while(bookCount>0)
			{

				books.add(new Book(entry.getKey(),entry.getValue()));
				bookCount--;
			}
		}

		// System.out.print(books.size());
		Collections.sort(books,new CountSortBook());
		//Collections.sort(books,new NameSortBook());

		for(int i=0;i<books.size();i++)
		{

			if(i==books.size()-1)
			{
				System.out.print(books.get(i).title); 
			}
			else
			{
				System.out.print(books.get(i).title+","); 
			}
			if(i != 0 && i%row==0)
			{
				System.out.println();
			}

		}

		while(books.size()<col)
		{
			System.out.print(",_");
			col--;
		}
	}

	public class Book 
	{
		String title;
		int count;

		public Book(String name,int count)
		{
			this.title = name;
			this.count = count;
		}

	}

	public class CountSortBook implements Comparator<Book>
	{

		@Override
		public int compare(Book o1, Book o2) 
		{
			return o2.count-o1.count==0?o2.title.compareTo(o1.title):o2.count-o1.count;
			//return o1.title.compareTo(o2.title)==0?(o1.count-o2.count):o1.title.compareTo(o2.title);
		}
	}
	
	public class NameSortBook implements Comparator<Book>
	{

		@Override
		public int compare(Book o1, Book o2) 
		{
			return o1.title.compareTo(o2.title);
			//return o1.title.compareTo(o2.title)==0?(o1.count-o2.count):o1.title.compareTo(o2.title);
		}
	}
}
