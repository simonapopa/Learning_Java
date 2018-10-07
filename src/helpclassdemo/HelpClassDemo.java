package helpclassdemo;

public class HelpClassDemo {

	void helpOn(int answer) {

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
			System.out.println("\nThe for statement");
			System.out.println("\nfor(initialization;condition;iteration)");
			System.out.println("\n\tstatement;");
			break;

		case '4':
			System.out.println("\nThe while statement");
			System.out.println("\nwhile(condition)");
			System.out.println("\n\tstatement;");
			break;

		case '5':
			System.out.println("\nThe do-while statement");
			System.out.println("\ndo{");
			System.out.println("\n\tstatement;");
			System.out.println("\n}while(condition);");
			break;

		case '6':
			int x;
			for (x = 0; x >= -5; x--)
				System.out.println(x);
			break;

		}
		System.out.println();
	}

	void showMenu() {

		System.out.println(
				"Help on: \n    1. if \n    2. switch \n    3. for \n    4. while \n    5. do-while \n    6. countdown \n    Choose q to quit.");
		System.out.print("Choose one: ");
	}

	boolean isValid(int ch) {
		if (ch < '1' | ch > '7' & ch != 'q')
			return false;
		else
			return true;
	}

}
