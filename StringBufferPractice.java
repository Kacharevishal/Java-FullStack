package com.string;

public class StringBufferPractice {

	public static void main(String[] args) {

		StringBuffer s1 = new StringBuffer("Vishal");
		StringBuffer s2 = new StringBuffer("Kachare");
		
		System.out.println(s1 == s2);
		System.out.println(s1.toString().equals(s2.toString()));
	    System.out.println(s1.append("Kachare")); // modification in existing string
		System.out.println(s1.capacity()); // print capacity string default size 16 + char = 22
		System.out.println(s1.charAt(4));// print index
		System.out.println(s1.codePointAt(3)); //print asci
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.equals(s2)); // check ref
		System.out.println(s1.indexOf("i")); // check index
		System.out.println(s1.isEmpty()); // check index is empty 
		System.out.println(s1.lastIndexOf("l")); //check last index of char
		System.out.println(s1.length()); // count length
		System.out.println(s1.substring(2));// remove first char
		System.out.println(s1.hashCode()); //print content hash code
		System.out.println(s1.toString()); // convert to string
		//System.out.println(s1.delete(1, 3)); //delete char
		//System.out.println(s1.deleteCharAt(1)); delete char
		//System.out.println(s1.insert(6, "Shashikant")); // insert String 
		System.out.println(s1.repeat(s2, 1)); // repeat String 
		//System.out.println(s1.replace(0, 5, "Sushant")); //replace String
		//System.out.println(s1.reverse());// reverse the string
	}

}
