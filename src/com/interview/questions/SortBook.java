	package com.interview.questions;
	
	/**
	 * Urban Clap coding round HackerRank 15-07-2019
	 * 
	 * Problem statement:
	 * 
	 * Given a list of books with name and a shelf to put these books M and one shelf can hold N number of books.
	 * You have arrange these book in shelf alphabetically order if books first alphabet is same then arrange to 
	 * according to their count.
	 * 
	 * Used TreeMap
	 * Used Comparator Interface
	 * **/
	public class SortBook {
	
	}
	
	
	
	/**
	Tony has a collection of books gifted to him by his grandfather. Each book has an title. 
	There can be multiple copies of each book in the collection.
	
	He just bought a new bookshelf with M horizontal shelves where each shelf can hold N books. 
	So total the bookshelf can hold MxN books.
	
	He is going to arrange the books in a particular order. He will first group books by title 
	and count how many books each group has. He will arrange the groups from highest to lowest number of books. 
	In case of clash of same number of books in some groups, titles sorted alphabetically will be used for
	 resolving clash.
	
	You are given an arrays of strings (titles) and shelf's size in rows and columns.
	
	The order of the arrangement of books won't be from left to right only. It would alternate with 
	rows(left to right and right to left and so on in a zig zag way). Please refer to the sample output
	 for better understanding.
	
	Suppose we have a bookshelf of 4 columns and 5 rows. The order of arrangement will be as shown below
	
	image
	
	If a specific location is empty, print '-' (without inverted commas)
	
	Important: To have a working solution, you can try solving the problem in two parts:
	
	    In first iteration you can assume that there won't be any tie breakers required in input 
	    cases and shelf is of one row only ( = 1, large enough to accommodate all books).
	    In the second iteration, solve for all constraints.
	
	Input Format
	
	The first line contains an integer denoting the total number of books.
	
	The third line contains the list of space separated .
	
	The fourth line contains two space separated integers , .
	
	Note: MXN will always be greater than or equals to number of books
	
	Constraints
	
	1 1000
	
	1 ,   50
	
	Output Format
	
	Output contains lines with each lines containing ( ) books in format:
	
	separated by commas
	
	If a specific location is empty, print -
	
	The order of the arrangement of books won't be from left to right only. It would alternate with 
	rows(left to right and right to left and so on in a zig zag way). Please refer to the sample output
	 for better understanding.
	
	Sample Input 0
	
	5
	Maths Maths Economics Economics Economics
	1 5
	
	Sample Output 0
	
	Economics,Economics,Economics,Maths,Maths
	
	Sample Input 1
	
	5
	Physics Maths Maths Biology Physics
	1 7
	
	Sample Output 1
	
	Maths,Maths,Physics,Physics,Biology,-,-
	
	Sample Input 2
	
	10
	Computers Accounts Accounts Economics Business Physics Physics Chemistry Maths Business
	2 8
	
	Sample Output 2
	
	Accounts,Accounts,Business,Business,Physics,Physics,Chemistry,Computers
	-,-,-,-,-,-,Maths,Economics
	
	
	 * **/
	
