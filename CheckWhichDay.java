package com.practice;

import java.util.Scanner;

public class CheckWhichDay {

	public static void main(String[] args) {

//		2. Switch Case – Day of Week
//		Given an integer (1–7), print the corresponding day name using switch.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number Between 1 To 7: ");
		
		int num = scan.nextInt();
		
		switch(num)
		{
		case 7:
		{
			System.out.println("Sunday");
			break;
		}
		
		case 1:
		{
			System.out.println("Monday");
			break;
		}
		
		case 2:
		{
			System.out.println("Tuesday");
			break;
		}
		
		case 3:
		{
			System.out.println("Wednesday");
			break;
		}
		
		case 4:
		{
			System.out.println("Thursday");
			break;
		}
		
		case 5:
		{
			System.out.println("Friday");
			break;
		}
		
		case 6:
		{
			System.out.println("Saturday");
			break;
		}
		default :
		{
			System.out.println("Plaease Enter Valid Input...");
			break;
		}
		}
		scan.close();
	}

}
