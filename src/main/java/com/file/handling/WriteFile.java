package com.file.handling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

public class WriteFile {

	/**
	 * Write File to File System using BufferReader 
	 * @param BufferedReader, String
	 * @return {@link Void}
	 * **/
	public void writeFileUsingBuffer(BufferedReader reader,String fileName)
	{
		try {
			FileWriter write = new FileWriter(fileName);
			String str;
			while((str=reader.readLine())!=null)
			{
				write.append(str);
				write.append("\n");
			}
			write.flush();
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Write File to File System using Property 
	 * @param Properties, String
	 * @return {@link Void}
	 * **/
	public void writeFileUsingProperty(Properties prop,String fileName)
	{
		try {
			FileWriter write = new FileWriter(fileName);

			try
			{
				Set<Entry<Object, Object>> entrySet = prop.entrySet();
				for(Entry<Object, Object> set : entrySet)
				{
					write.append(set.toString());
					write.append("\n");
				}
				write.flush();
				write.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
