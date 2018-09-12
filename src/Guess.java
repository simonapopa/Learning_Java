import java.io.IOException;

public class Guess {

	public static void main(String[] args) throws IOException {
		char character, answer;

		character = 'K';

		System.out.print("Guess the keyword between A-Z: ");
		answer = (char) System.in.read();

		if (character == answer) {
			System.out.println("You entered: " + answer + ". RIGHT!");
		}

		else {
			System.out.println("You entered: " + answer + ". WRONG! Try again.");

		}
	}
}
