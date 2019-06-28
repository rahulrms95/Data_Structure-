package com.java.design.pattern;

public class FactoryDesign {

	public FactoryDesign() {
	}
	
	public ShapeAstractFactory getInstance(String type)
	{
		switch (type) {
		case "square":
			return new Square(type, 2, 4);
		case "reactangle":
			return new Reactangle(type, 2, 4,6);
		default:
			return new Square(type, 2, 4);
		}
	}

}
