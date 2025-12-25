package controlFlowStatemente;

public class CheckTheTypeOfTrangle {

	public static void main(String[] args) {

		int sideNo1 = 10;
		int sideNo2 = 20;
		int sideNo3 = 10;

		System.out.println("Check the type of Triangle");

		if (sideNo1 == sideNo2 && sideNo2 == sideNo3 && sideNo1 == sideNo3) {
			System.out.println("Equilateral Triangle");
		} else if (sideNo1 == sideNo2 || sideNo2 == sideNo3 || sideNo1 == sideNo3) {
			System.out.println("Isosceles Triangle");
		} else {
			System.out.println("Scalene Triangle");
		}
	}
}
