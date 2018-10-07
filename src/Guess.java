import java.io.IOException;

public class Guess {

	public static void main(String args[]) throws IOException {
		char character, answer, ignore;
		int i = 3;

		character = 'K';

		i--;

		for (; i >= 0; i--) {

			System.out.print("Guess the keyword between A-Z: ");
			answer = (char) System.in.read();

			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');

			if (answer == character)
				System.out.println("\nYou entered: " + answer + ". RIGHT!");
			else {
				System.out.println("\nYou entered: " + answer + ". WRONG! Try again.");
				System.out.println("\n" + i + " remaining tries");

				if (i == 0)
					System.out.println("\nNo more remaining tries. The character is K.");

			}

		}
	}
}
