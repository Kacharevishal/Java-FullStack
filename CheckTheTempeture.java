package controlFlowStatemente;

public class CheckTheTempeture {

	public static void main(String[] args) {
		// Hot, Warm, Cool, or Cold.

		int temperature = 20;

		if (temperature <= 0) {
			System.out.println("Temperature is a Cold");
		} else if (temperature >= 1 && temperature <= 10) {
			System.out.println("Temperature is a Cool");
		} else if (temperature >= 11 && temperature <= 25) {
			System.out.println("Temperature is a Warm");
		} else if (temperature >= 26) {
			System.out.println("Temperature is a Hot");
		} else {
			System.out.println("Invalid Input...");
		}
	}
}
