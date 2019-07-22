package com.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNames {

	  static class Name
	    {
	        String name;
	        int num;
	        String last;
	        public Name(String name,int num,String last)
	        {
	            this.name = name;
	            this.num = num;
	            this.last = last;
	        }
	    }

	  static  class Sort implements Comparator<Name>
	    {
	        public int compare(Name n1,Name n2)
	        {
	           // return n1.name.compareTo(n2.name)==0?n1.num-n2.num:n1.name.compareTo(n2.name);
	           // return n1.name.compareTo(n2.name)==0?n1.last.compareTo(n2.last):n1.name.compareTo(n2.name);
	            return n1.num-n2.num==0?n1.name.compareTo(n2.name):n1.num-n2.num;
	        }
	    }
	    public static List<Name> sortRoman(List<String> names) {
	    // Write your code here
	        List<Name> objs = new ArrayList<>();
	        for(int i=0;i<names.size();i++)
	        {
	            String arr[] = names.get(i).split(" ");
	            int num = convert(arr[2]);
	            objs.add(new Name(arr[0], num,arr[1]));
	        }
	        Collections.sort(objs,new Sort());
	       
	        return objs;
	    }

	    public static int convert(String str)
	    {
	        return Integer.parseInt(str);
	    }
	    
	    public static void main(String[] args) {
			
	    	List<String> lst = Arrays.asList("rahul dev 1302","puneet bajaj 1200","abc def 1200","rahul kumar 1200","puneet gupta 3434","abc aef 5434");
	    	print(sortRoman(lst));
	    	
		}
	    
	    static void print(List<Name> lst )
	    {
	    	for(int i=0;i<lst.size();i++)
	    	{
	    		System.out.println(lst.get(i).name+" "+lst.get(i).last+" "+lst.get(i).num);
	    	}
	    }
}
