package com.constructor;

public class ConstructorOverloding {

	//Write a program to demonstrate constructor overloading with at least two constructors having different parameter lists.
	ConstructorOverloding(int id, String name)
	{
		System.out.println("id: "+id);
		System.out.println("Name: "+name);
	}
	
	ConstructorOverloding(int id, String name, char div)
	{
		System.out.println("id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Div: "+div);
	}
	public static void main(String[] args) {

		ConstructorOverloding obj = new ConstructorOverloding(01, "Vishal Kachare");
		ConstructorOverloding obj1 = new ConstructorOverloding(02, "Vishal Kachare",'B');

		
	}

}
