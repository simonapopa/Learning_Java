package vehicle;

public class TwoVehicles {

	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		Vehicle number = new Vehicle();

		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		// int range1 = minivan.ranges();
		// int range2 = sportscar.ranges();

		System.out.println("Minivan can carry up to " + minivan.passengers + ".\n");
		minivan.range();

		if (number.isEven(10))
			System.out.print("10 is " + number.isEven(10));

		if (number.isEven(9))
			System.out.println("\n9 is " + number.isEven(9));

		if (number.isEven(8)) 
			System.out.println("\n8 is " + number.isEven(8));
		
		System.out.println("\nSportscar can carry up to " + sportscar.passengers + ". ");
		sportscar.range();
	}

}
