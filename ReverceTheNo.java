package practice12;
import java.util.Scanner;

public class ReverceTheNo {

	public static void main(String[] args) {

		// Reverse The Given Number
		
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
		System.out.println("User Entered Number: "+orignalNo);
		System.out.println("Revensed Number: "+rev);
		scan.close();
	}

}
