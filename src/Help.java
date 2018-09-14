import java.io.IOException;

public class Help {

	public static void main(String[] args) throws IOException {

		char answer;

		System.out.println("Help on: \n    1. if \n    2. switch \n    3. countdown");
		System.out.print("Choose one: ");

		answer = (char) System.in.read();

		switch (answer) {
		case '1':
			System.out.println("\nThe if statement");
			System.out.println("\nif(condition){\n\t statement sequence \n}else{\n\t statement sequence \n");
			break;

		case '2':
			System.out.println("\nThe switch statement");
			System.out.println("\nswitch(expression){");
			System.out.println("\n\t case constant1:\n\t\t statement sequence \n\t\t break;");
			System.out.println("\t case constant2:\n\t\t statement sequence \n\t\t break;");
			System.out.println("\t case constant3:\n\t\t statement sequence \n\t\t break;");
			System.out.println("\t...");
			System.out.println("\tdefault:\n\t\t statement sequence \n}");
			break;
		case '3':
			int x;
			for (x = 0; x >= -5; x--)
				System.out.println(x);

		default:
			System.out.print("Value entered does not exist.");
		}
	}

}
