
public class ScopeDemo {

	public static void main(String[] args) {
		int x;
		x = 10;
		if (x == 10) {
			int y = 20;
			System.out.println("x=" + x + "\n y=" + y);
			x = y + 2;
		}
		char y;
		y = 'A';
		System.out.println("x=" + x + "\n new y=" + y);
	}

}
