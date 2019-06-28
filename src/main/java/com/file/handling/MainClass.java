package com.file.handling;

public class MainClass {
	
	public static void main(String[] args) {

		String file = "catalina.out";
		String file2 = "dbConfig.properties";
		String file3 = "pom.xml";
		new ReadFile().readFileUsingProperty(file3);
		//new WriteFile().writeFileUsingBuffer(new ReadFile().readFileUsingBuffer(file3),"fileName");
		//new WriteFile().writeFileUsingProperty(new ReadFile().readFileUsingProperty(file3),"fileName2");
	}
}

