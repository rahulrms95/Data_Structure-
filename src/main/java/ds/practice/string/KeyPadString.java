package ds.practice.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeyPadString {

	static Set<String> keypad = new HashSet<>();
	public static void printKeypad(List<String> strList,String patt)
	{
		if(patt.length() == strList.size())
		{
			keypad.add(patt);
			//System.out.println(patt);
			return;
		}
		for(int i=0;i<strList.size();i++)
		{
			for(int k=0;k<strList.size();k++)
			{
				if(!patt.contains(""+strList.get(i).charAt(k)))
					printKeypad(strList, patt+strList.get(i).charAt(k));
			}
		}
	}

	public static void main(String[] args) {

		List<String> lstr  = new ArrayList<>();
		lstr.add("abc");
		lstr.add("def");
		lstr.add("ghi");

		printKeypad(lstr, "");
		System.out.println(keypad);
		System.out.println(keypad.size());
	}
}
