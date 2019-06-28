package com.file.handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class FileUtility {

	
	/**
	 * To Display File Data from BufferedReader Object
	 * @param BufferedReader
	 * @return {@link Void}
	 * **/
	public void printBufferReader(BufferedReader br)
	{
		String str;
		try {
			while((str = br.readLine())!=null)
			{
				System.out.println(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * To Display File Data from Properties Object
	 * @param Properties
	 * @return {@link Void}
	 * **/
	public void printProperty(Properties prop)
	{
		try
		{
			Set<Entry<Object, Object>> entrySet = prop.entrySet();
			for(Entry<Object, Object> set : entrySet)
			{
				System.out.println(set.getKey()+" "+set.getValue());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
