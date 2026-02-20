package com.modifiters1;

public class AnimalPublicMain {

	public static void main(String[] args) {

		AnimalPublic a = new AnimalPublic();
		
		
		
		System.out.println("Animal Id: "+(a.anId = 12));
		System.out.println("Animal Name: "+(a.anName= "Tommy"));
		a.display();
	}
}
