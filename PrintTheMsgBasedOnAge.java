package controlFlowStatemente;

public class PrintTheMsgBasedOnAge {

	public static void main(String[] args) {

		int age = 60;

		if (age >= 0 && age <= 12) {
			System.out.println("Age: " + age + " he is " + "Child");
		} else if (age >= 13 && age <= 19) {
			System.out.println("Age: " + age + " he is " + "Teenager");
		} else if (age >= 20 && age <= 59) {
			System.out.println("Age: " + age + " he is " + "Adult");
		} else if (age >= 60) {
			System.out.println("Age: " + age + " he is " + "Senior Citizen");
		}
	}
}
