package vehicle;

public class TwoVehicles {

	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;

		int range1 = minivan.ranges();
		int range2 = sportscar.ranges();

		System.out.println("Minivan can carry up to " + minivan.passengers + " with range of " + range1);
		// minivan.range();

		System.out.println("Sportscar can carry up to " + sportscar.passengers + " with range of " + range2);
		// sportscar.range();
	}

}
