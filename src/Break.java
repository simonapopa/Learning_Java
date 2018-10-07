import java.io.IOException;

public class Break {

	public static void main(String[] args) throws IOException {
		char ch;

		for (;;) {
			ch = (char) System.in.read();
			if (ch == 'g')
				break;
		}
		System.out.println("\nBreak! You pressed 'q'.");
	}

}
