package com.practice;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {

//		1. Grade Calculator (if-else)
//		Write a method that takes a student’s marks (0–100) and returns:
//		A → 90+
//		B → 80–89
//		C → 70–79
//		D → 60–69
//		F → below 60
//		👉 Tests nested/ladder if-else.

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Your Marks for Checking Grade: ");
		int num = scan.nextInt();

		if (num >= 90 && num <= 100) {
			System.out.println("Excelent: " + " Grade A");
		}

		else if (num >= 80 && num <= 89) {
			System.out.println("Very Good: " + " Grade B");
		}

		else if (num >= 70 && num <= 79) {
			System.out.println("Nice: " + " Grade C");
		}

		else if (num >= 60 && num <= 69) {
			System.out.println("Avelage: " + " Grade D");
		}

		else if (num >= 35 && num <= 59) {
			System.out.println("Only Pass: " + " Grade E");
			
		} else if (num >= 1 && num <= 34) {
			System.out.println("Sorry You Are Failed: " + " Grade F");
		}

		else {
			System.out.println("Invalid Input Please Enter Valid Input");
		}
		scan.close();

	}

}
