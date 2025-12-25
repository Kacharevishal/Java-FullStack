package controlFlowStatemente;

public class CheckEvenNoOrGraterThan50 {

	public static void main(String[] args) {

		int number = 60;

		if (number % 2 == 0) {
			System.out.println(number + " is a Even Number");
			if (number > 50) {
				System.out.println(number + " is grater than 50");
			} else {
				System.out.println(number + " is less then 50");
			}
		} else {
			System.out.println(number + " is a Odd Number");
		}
	}
}
