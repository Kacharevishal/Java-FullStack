package com.modifiters1;

public class LaptoDefaultMain {

	public static void main(String[] args) {

		LaptopDefault lap = new LaptopDefault();
		
		System.out.println("Laptop Id: "+(lap.lapId = 12));
		System.out.println("Laptop Name: "+(lap.lapName= "Tommy"));
		lap.display();
	}

}
