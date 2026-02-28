package com.string;

public class ObjectClassMethods {

	public static void main(String[] args) {

		Object obj = new Object();
		Object obj1 = new Object();
		
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());
		System.out.println(obj.toString());
		
		System.out.println(obj.equals(obj));//true
		System.out.println(obj.equals(obj1));//false
	}

}
