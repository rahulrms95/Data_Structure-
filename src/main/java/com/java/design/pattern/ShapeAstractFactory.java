package com.java.design.pattern;

public abstract class ShapeAstractFactory {

	public String type;
	public int side_number;
	
	public ShapeAstractFactory(String type,int num)
	{
		this.type = type;
		this.side_number = num;
	}
	public abstract void Draw();
	public abstract int size();
}
