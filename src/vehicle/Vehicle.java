package vehicle;

public class Vehicle {

	int passengers, fuelcap, mpg;

	void range() {
		System.out.println("Range is " + fuelcap * mpg);

	}

	int ranges() {
		return fuelcap * mpg;

	}

}
