import java.io.IOException;

/* 
 * Write a program that reads characters from the keyboard until a period is received. Have the 
program count the number of spaces. Report the total at the end of the program.

 */

public class Chapter3ReadFromKeyboard {

	public static void main(String[] args) throws IOException {
		char answer;
		int count = 0;

		System.out.print("Enter something: ");

		do {

			answer = (char) System.in.read();

			if (answer == ' ')
				count++;

		} while (answer != '.');
		System.out.println("Nr of spaces is " + count);

	}

}
