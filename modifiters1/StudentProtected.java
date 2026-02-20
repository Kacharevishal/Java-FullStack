package com.modifiters1;

public class StudentProtected {

	protected int stdId;
	protected String stdName;

	protected StudentProtected() {
		System.out.println("This is constructor of a Student Class....");
	}

	protected void display() {
		System.out.println("This is a display Method from student");
	}

}
