package practice12;
import java.util.Scanner;
public class CheckArmStrNo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = scan.nextInt();
		int orgNo = num;
		int arm = 0;	
		while(num > 0)
		{
			int rem = num % 10;
			arm = rem*rem*rem+arm;
			num = num/10;
		}
		if(orgNo == arm)
		{
			System.out.println(orgNo+" is a Armstrong Number...");
		}
		else
			System.out.println(orgNo+" is Not a Armstrong Number...");
		scan.close();
	}
}
