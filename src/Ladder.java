
public class Ladder {
// Demonstrate an if-else-if ladder
	public static void main(String[] args) {
		int x;

		for (x = 0; x < 6; x++) {
			if (x == 1)
				System.out.println("x=" + x);
			else if (x == 2)
				System.out.println("x=" + x);
			else if (x == 3)
				System.out.println("x=" + x);
			else if (x == 4)
				System.out.println("x=" + x);
			else
				System.out.println(x + " is not between 1 and 4");
		}
	}

}
