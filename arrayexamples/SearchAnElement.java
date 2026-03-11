package arrayexamples;

import java.util.Scanner;

public class SearchAnElement {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = scan.nextInt();
		boolean flag = false;
		int[] arr = {100,20,60,40,10};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == num)
			{
				System.out.println(num+": Number is Present in the Array...");
				flag = true;
				break;	
			}
		}
		if(flag == false)
		{
			System.out.println(num+": Number is Not Present in the Array...");
		}
		scan.close();
	}
}
