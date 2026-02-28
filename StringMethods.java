package com.string;

public class StringMethods {

	public static void main(String[] args) {

		// Following are the Methods of String Class
		
		String str1 = "Vishal";
		String str2 = "Sushant";
		
		System.out.println(str1.charAt(0)); //print char
		System.out.println(str1.codePointAt(4)); //print asci value
		System.out.println(str1.codePointBefore(5));
		System.out.println(str1.codePointCount(1, 5));
		System.out.println(str1.compareTo(str2)); //print same char count
		System.out.println(str1.compareToIgnoreCase(str2)); //print different char count
		System.out.println(str1.concat(str2));//join two strings
		System.out.println(str1.contains("i")); //check char present
		System.out.println(str1.contentEquals("Vishal")); // check string content equals
		System.out.println(str1.endsWith("l")); // check the string end with char
		System.out.println(str1.startsWith("V")); // check the string start with char
		System.out.println(str1.equals(str2));// check the content of string
		System.out.println(str1.equalsIgnoreCase("Vishal"));// check the content + same length + no case sencetive
		System.out.println(str1.formatted()); // check format
		System.out.println(str1.hashCode()); // check string hash code
		System.out.println(str1.indent(5)); // add spaces before the string
		System.out.println(str1.indexOf("V")); //check index of given char
		System.out.println(str1.intern());
		System.out.println(str1.isBlank()); // check is a blank
		System.out.println(str1.lastIndexOf("l")); //check last index
		System.out.println(str1.length()); // check str length
		System.out.println(str1.matches("Vishal"));//check content
		System.out.println(str1.repeat(4));// how many times print given string
		System.out.println(str1.replace("V", "S"));//replace char
		System.out.println(str1.replaceAll(str1, str2)); //replace all content
		System.out.println(str1.replaceFirst(str1, "Vishal"));
		System.out.println(str1.strip());//remove spaces
		System.out.println(str1.toCharArray()); // convert the char array
		System.out.println(str1.toString()); // all string obj prints
		System.out.println(str1.trim()); // remove spaces
		System.out.println(str1.getBytes()); //get byte code
		
	}

}
