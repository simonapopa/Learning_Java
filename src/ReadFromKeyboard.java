
public class ReadFromKeyboard {

	public static void main(String args[]) throws java.io.IOException {
		char ch;
		System.out.print("Press any key and then ENTER: ");

		ch = (char) System.in.read();

		System.out.println("You pressed: " + ch);
	}

}
