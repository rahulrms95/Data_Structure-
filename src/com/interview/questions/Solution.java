package com.interview.questions;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int totalBooks = Integer.parseInt(bufferedReader.readLine().trim());

		List<String> bookTitles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.collect(toList());

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int bookShelfRows = Integer.parseInt(firstMultipleInput[0]);

		int bookShelfCols = Integer.parseInt(firstMultipleInput[1]);

		bufferedReader.close();

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
		Collections.sort(books,new SortBook());

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

	public class SortBook implements Comparator<Book>
	{

		@Override
		public int compare(Book o1, Book o2) 
		{
			return o1.title.compareTo(o2.title)==0?(o1.count-o2.count):o1.title.compareTo(o2.title);
		}
	}
}
