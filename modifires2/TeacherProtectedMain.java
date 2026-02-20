package com.modifires2;

import com.modifiters1.StudentProtected;

public class TeacherProtectedMain extends StudentProtected{

	
	public static void main(String[] args) {
		TeacherProtectedMain tech = new TeacherProtectedMain();
		tech.display();
		System.out.println("Student Id: "+(tech.stdId=11));
		System.out.println("Student Name"+(tech.stdName="Raj Shing"));	
	}	
}
