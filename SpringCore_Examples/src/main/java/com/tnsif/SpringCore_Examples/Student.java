package com.tnsif.SpringCore_Examples;
public class Student {
	private String name;
	public Student()
	{
		System.out.println(" Students object created ");
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display()
	{
		System.out.println(" Student: "+name);
	}
}
