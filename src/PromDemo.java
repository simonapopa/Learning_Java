
public class PromDemo {

	public static void main(String args[]) {
		byte b;
		int i;
		char ch1, ch2;

		b = 10;
		i = b * b;

		b = (byte) (b * b);
		System.out.println("i=" + i + "\t and b=" + b);
		System.out.println();

		ch1 = 'a';
		ch2 = 'b';
		System.out.println("initial ch1=" + ch1 + "\t and ch2=" + ch2);
		ch1 = (char) (ch1 + ch2);
		ch2 = (char) (ch1 + ch2);
		System.out.println("ch1=" + ch1 + "\t and ch2=" + ch2);
		ch2 = (char) (ch2 - ch1);
		System.out.println("ch2=" + ch2);

		System.out.println();

		for (int y = 0; y < 5; y++) {
			System.out.println(y + " /3= " + y / 3);
			System.out.println(y + " /3 with fractions: " + (double) y / 3);
			System.out.println();
		}

	}

}
