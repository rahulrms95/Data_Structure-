package com.java.design.pattern;

public class Reactangle extends ShapeAstractFactory{

	int side1;
	int side2;
	public Reactangle(String type, int num,int side1,int side2) {
		super(type, num);
		this.side1 = side1;
		this.side2 = side2;
	}

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Reactangle Draw is Called!!");
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		System.out.println(this.side1*this.side2);
		return this.side1*this.side2;
	}

	
}
