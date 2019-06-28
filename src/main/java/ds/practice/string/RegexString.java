package ds.practice.string;

import java.util.regex.Pattern;

public class RegexString {

	
	public static void main(String[] args) {
		
		Pattern pt = Pattern.compile("()");
		
		String str = "rahul()puneet";
		String[] strArray = pt.split(str);
		
		for(String temp : strArray)
		{
			System.out.println(temp);
		}
	}
}
