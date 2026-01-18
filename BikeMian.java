package practice17;

public class BikeMian {

	public static void main(String[] args) {

		Bike zx10r = new Bike();
		System.out.println("--------------------------------");
		System.out.println("This is a Bike No:1");
		System.out.println(("Bike Name: ")+(zx10r.bikeName = "Ninja ZX10R"));
		System.out.println(("Engine CC: ")+(zx10r.engineCC = 800));
		System.out.println(("Bike Price: ")+(zx10r.bikePrice = 2000000));
		
		Bike h2r = new Bike();
		System.out.println("--------------------------------");
		System.out.println("This is a Bike No:2");
		System.out.println(("Bike Name: ")+(h2r.bikeName = "Ninja H2R"));
		System.out.println(("Engine CC: ")+(h2r.engineCC = 1200));
		System.out.println(("Bike Price: ")+(h2r.bikePrice = 8000000));
		
		Bike mt15 = new Bike();
		System.out.println("--------------------------------");
		System.out.println("This is a Bike No:3");
		System.out.println(("Bike Name: ")+(mt15.bikeName = "MT-15"));
		System.out.println(("Engine CC: ")+(mt15.engineCC = 150));
		System.out.println(("Bike Price: ")+(mt15.bikePrice = 300000));
	}

}
