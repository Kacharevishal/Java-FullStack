package controlFlowStatemente;

public class CheckCandidateValidForVote {

	public static void main(String[] args) {

		int age = 30;

		if (age >= 18) {
			System.out.println("You are Eligible for a Vote");

			if (age >= 25) {
				System.out.println("You are Eligible to contest in elections");
			} else {
				System.out.println("You are Not Eligible to contest in elections");
			}
		} else {
			System.out.println("You are Not Eligible for Vote");
		}
	}

}
