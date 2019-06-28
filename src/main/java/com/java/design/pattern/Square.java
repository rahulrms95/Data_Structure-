package com.java.design.pattern;

public class Square extends ShapeAstractFactory{


	int side;
	public Square(String type, int num,int side) {
		super(type, side);
		this.side = side;
	}

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("Square Draw is Called!!");
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		System.out.println(this.side*this.side);
		return this.side*this.side;
	}

	

}
