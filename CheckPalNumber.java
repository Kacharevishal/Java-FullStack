package practice12;

import java.util.Scanner;

public class CheckPalNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = scan.nextInt();
		int orignalNo = num;
		int rev = 0;
		
		while(num > 0)
		{
			int rem = num % 10;
			rev = rev*10+rem;
			num = num / 10;
		}
		if(orignalNo == rev)
		{
			System.out.println(orignalNo+" is a Palendrome Number...");
		}
		else
			System.out.println(orignalNo+" is Not a Palendrome Number...");
		scan.close();
	}

}
