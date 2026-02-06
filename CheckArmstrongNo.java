package com.practice;

public class CheckArmstrongNo {

	public static void main(String[] args) {

		int num = 153; //  1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
		int temp = num;
	    int arm = 0;
	    
		while(num > 0)
		{
			int rem = num % 10;
			arm = (rem * rem * rem) + arm;
			num = num / 10;
		}
		if(temp == arm)
		{
			System.out.println("Given Number is a Armstrong Number...");
		}
		else
		{
			System.out.println("Given Number is not a Armstrong Number...");
		}
	}

}
