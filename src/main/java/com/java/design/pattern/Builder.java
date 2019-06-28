package com.java.design.pattern;

public class Builder {

	private String name;
	private int age;
	
	public Builder(BuildHelper build)
	{
		this.name = build.name;
		this.age = build.age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static class BuildHelper
	{
		private String name;
		private int age;
		
	
		public Builder build()
		{
			return new Builder(this);
		}
		
		public int getAge() {
			return age;
		}
		
		public String getName() {
			return name;
		}
		
		public BuildHelper setName(String name) {
			this.name = name;
			return this;
		}

		public BuildHelper setAge(int age) {
			this.age = age;
			return this;
		}
	}
}
