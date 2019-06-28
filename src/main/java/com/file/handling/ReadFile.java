package com.file.handling;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class ReadFile {


	/**
	 * Read File line by line any can be used to read any type of file
	 * @param String
	 * @return {@link BufferedReader}
	 * **/
	public BufferedReader readFileUsingBuffer(String file)
	{
		BufferedReader br = null;
		try {
			FileReader reader = new FileReader(file);
			br = new BufferedReader(reader);
			//br.close();
			//reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return br;
	}

	/**
	 * Read Given file as key value pair 
	 * @param String
	 * @return {@link Properties} Object
	 * **/
	public Properties readFileUsingProperty(String file)
	{
		if(file.contains("xml"))
		{
		//	return loadXmlFile(file);
		}

		Properties prop = null;
		try {
			FileReader reader = new FileReader(file);
			prop = new Properties();
			prop.load(reader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}

	public Properties loadXmlFile(String file)
	{
		Properties prop = null;
		try {
			InputStream in = new FileInputStream(file);
			BufferedInputStream bi = new BufferedInputStream(in);
			int ch1;
			char[] charArray = new char[1000];
			int i=0;
			while((ch1=in.read())!= -1)
			{
				charArray[i] = (char)ch1;
				i++;
			}
			String str = new String(charArray);
			System.out.println(str);
			//prop.loadFromXML(in);
			System.out.println(prop);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidPropertiesFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
