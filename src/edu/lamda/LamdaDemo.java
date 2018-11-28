package edu.lamda;

import java.io.File;
import java.io.FileFilter;

public class LamdaDemo {
	public static void main(String[] args) {
	
		/*
		FileFilter fileFilter = new FileFilter() {
			@Override
			public boolean accept(File file) {
					return file.getName().endsWith(".java");
			}
		};
		*/
		
		FileFilter filterLambda = (File file) -> file.getName().endsWith(".java");
		
		File dir = new File("E:\\Workspaces\\CXF\\FirstWebService\\src\\edu\\first\\learning\\ws");
		File[] javaFiles = dir.listFiles(filterLambda);
		
		for(File file: javaFiles) {
			System.out.println(file.getAbsolutePath());
		}
	}
}
