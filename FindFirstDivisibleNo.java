package com.practice;

import java.util.Scanner;

public class FindFirstDivisibleNo {

	public static void main(String[] args) {

//		3. Find First Divisible Number (break)
//		Given an array and a divisor, print the first element divisible by the divisor and stop the loop immediately.
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the Divisor: ");
		
		int divisor = scan.nextInt();
		
		int arr[] = {2,3,4,5,6,7,8,9};
		
		for(int i = 0;i<arr.length;i++)
		{
			if(divisor % arr[i] == 0)
			{
				System.out.println(arr[i]);
				break;
			}
		}
		scan.close();
	}

}
