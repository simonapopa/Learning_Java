
public class Power {

	public static void main(String[] args) {
		int e, result;

		for (int i = 0; i < 10; i++) {
			result = 1;
			e = i;

			System.out.println("e=" + e);
			
			while (e > 0) {
				result *= 2;
				e--;
			}
			System.out.println("2 to the " + i + " power is " + result);
		}

	}

}
