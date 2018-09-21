package helpclassdemo;

import java.io.IOException;

public class HelpMain {

	public static void main(String[] args) throws IOException {

		char choise, ignore;
		HelpClassDemo help = new HelpClassDemo();
		for (;;) {
			do {
				help.showMenu();
				choise = (char) System.in.read();

				do {
					ignore = (char) System.in.read();

				} while (ignore != '\n');

			} while (!help.isValid(choise));

			if (choise == 'q')
				break;

			System.out.println("\n");
			help.helpOn(choise);
		}

	}

}
