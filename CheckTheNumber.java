package controlFlowStatemente;

public class CheckTheNumber {

	public static void main(String[] args) {

		int number = -5;

		System.out.println("Check The Number Positive, Negative of Zero");

		if (number > 0) {
			System.out.println(number + " is a Positive Number");
		} else if (number == 0) {
			System.out.println(" This is a Zero Number");
		} else if (number < 0) {
			System.out.println(number + " is a Negative Number");
		}
	}

}
