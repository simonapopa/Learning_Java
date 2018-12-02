
public class BreakWithNestedLoops {

	public static void main(String[] args) {

		int t = 0;

		for (int i = 1; i <= 3; i++) {
			System.out.println("\nOuter loop count: " + i);
			System.out.print("\n\tInner loop count: ");

			if (i == 1)
				while (t <= 100) {
					if (t == 31)
						break;
					System.out.print(t + " ");
					t++;
				}
			System.out.println();

			if (i == 2)
				while (t <= 100) {
					if (t == 61)
						break;
					System.out.print(t + " ");
					t++;
				}
			System.out.println();

			if (i == 3)
				while (t <= 100) {
					if (t == 101)
						break;
					System.out.print(t + " ");
					t++;
				}
			System.out.println();

		}
		System.out.println("Loops completed");
	}

}
