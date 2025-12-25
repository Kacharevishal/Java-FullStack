package controlFlowStatemente;

public class CheckLeapYear {

	public static void main(String[] args) {

		int currentYear = 2024;

		if (currentYear % 4 == 0) {
			System.out.println(currentYear + " is Leap Year");
		} else {
			System.out.println(currentYear + " is not Leap Year");
		}
	}

}
