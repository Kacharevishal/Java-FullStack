package controlFlowStatemente;

public class SwitchCaseEvenOddExample {

	public static void main(String[] args) {

		int num = 11;
		
		switch(num % 2)
		{
		case 0 :
		{
			System.out.println("This is Even Number...");
			break;
		}
		case 1:
			System.out.println("This is Odd Number...");
			break;
		}
	}

}
