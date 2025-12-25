package controlFlowStatemente;

public class TemperatureChecker {

	public static void main(String[] args) {

		int temperature = 40;

		System.out.println("Check the temperature Hot or Normal");

		if (temperature > 30) {
			System.out.println("Hot Day...");
		} else {
			System.out.println("Normal Day...");
		}
	}

}
