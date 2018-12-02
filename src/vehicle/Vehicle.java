package vehicle;

public class Vehicle {

	int passengers, fuelcap, mpg;

	void range() {
		System.out.println("Range is " + fuelcap * mpg);

	}

	int ranges() {
		return fuelcap * mpg;

	}

	boolean isEven(int x) {
		if (x % 2 == 0)
			return true;
		else
			return false;
	}

	double fuelneeded(int miles) {
		return (double) miles / mpg;
	}

}
