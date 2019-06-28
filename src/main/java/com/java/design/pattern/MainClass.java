package com.java.design.pattern;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java.design.pattern.Builder.BuildHelper;

public class MainClass implements Runnable{
	
	
	public MainClass() {

	}

	public static void main(String[] args) {

		testFactory();
		//testSinglton();
		//testBuilder();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Singlton.getObject());
	}
	
	public static void testFactory()
	{
		ShapeFactory obj = new ShapeFactory();
		ShapeAstractFactory fo = obj.getInstance("square");
		fo.Draw();
		fo.size();
		
		ShapeAstractFactory fo1 = obj.getInstance("reactangle");
		fo1.Draw();
		fo1.size();
		
	}
	public static void testSinglton()
	{
		new Thread(new MainClass()).start();
		new Thread(new MainClass()).start();
		new Thread(new MainClass()).start();
		new Thread(new MainClass()).start();
		new Thread(new MainClass()).start();
	}
	
	public static void testBuilder()
	{
		Builder obj = new Builder.BuildHelper().setAge(23).setName("rahul").build();
		BuildHelper bh = new Builder.BuildHelper().setAge(23).setName("rahul");
		
		System.out.println(obj.getName()+" "+obj.getAge());
		System.out.println(bh.getName()+" "+bh.getAge());
	}

}
