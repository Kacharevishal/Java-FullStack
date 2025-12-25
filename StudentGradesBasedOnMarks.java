package controlFlowStatemente;

public class StudentGradesBasedOnMarks {

	public static void main(String[] args) {

		int studMarks = 75;
		System.out.println("Find Your Grade Using Marks");

		if (studMarks >= 90 && studMarks <= 100) {
			System.out.println("Marks: " + studMarks + " Grade: A");
		} else if (studMarks >= 75 && studMarks <= 89) {
			System.out.println("Marks: " + studMarks + " Grade: B");
		} else if (studMarks >= 50 && studMarks <= 74) {
			System.out.println("Marks: " + studMarks + " Grade: C");
		} else if (studMarks >= 35 && studMarks <= 49) {
			System.out.println("Marks: " + studMarks + " Grade: D");
		} else if (studMarks >= 0 && studMarks <= 34) {
			System.out.println("Marks: " + studMarks + " Sorry You are Fail...");
		} else {
			System.out.println("Invalid Input please Enter a valid Input....");
		}
	}

}
