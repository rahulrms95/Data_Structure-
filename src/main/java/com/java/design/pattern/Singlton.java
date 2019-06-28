package com.java.design.pattern;

public class Singlton {

	
	private static Singlton instance;
	
	private Singlton()
	{
		
	}
	static
	{
		instance = new Singlton();
	}
	public static Singlton getInstance()
	{
		if(instance == null)
		{
			synchronized (Singlton.class) {
				if(instance == null)
				{
					instance = new Singlton();
				}
			}
		}
		
		return instance;
	}
	public static Singlton getObject()
	{
		return instance;
	}
}
