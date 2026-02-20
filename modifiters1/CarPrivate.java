package com.modifiters1;

public class CarPrivate {

	private int anId;
	private String anName;

	private CarPrivate() {
		System.out.println("This is constructor of a Car Class....");
	}

	private void display() {
		System.out.println("This is a display Method from Car Class");
	}
	
	public static void main(String[] args) {
		CarPrivate cp = new CarPrivate();
		System.out.println("Car Id: "+(cp.anId = 100));
		System.out.println("Car Name: "+(cp.anName= "Lamborginy"));
		cp.display();
	}
}
