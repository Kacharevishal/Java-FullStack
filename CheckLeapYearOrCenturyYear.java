package controlFlowStatemente;

public class CheckLeapYearOrCenturyYear {

	public static void main(String[] args) {

		int year = 2003;

		if (year % 4 == 0) {
			System.out.println(year + " Year is a Leap Year");

			if (year % 100 == 0) {
				System.out.println(year + " Year is a Century Year");
			} else {
				System.out.println(year + " Year is Not Century Year");
			}
		} else {
			System.out.println(year + " Year is Not Leap Year");
		}
	}

}
