
public class LogicalOpTable {
	public static void main(String args[]) {
		boolean p, q;

		p = false;
		q = false;
		System.out.println("Logical table with boolean values:");
		System.out.println("| p\t| q\t| p & q\t| p | q\t| p ^ q\t|!p     |");
		System.out.println("|------\t|------\t|------\t|------\t|------\t|-------|");
		System.out.println(
				"|" + p + "\t|" + q + "\t|" + (p & q) + "\t|" + (p | q) + "\t|" + (p ^ q) + "\t|" + (!p) + "\t|");

		p = true;
		q = true;
		System.out.println("|------\t|------\t|------\t|------\t|------\t|-------|");
		System.out.println(
				"|" + p + "\t|" + q + "\t|" + (p & q) + "\t|" + (p | q) + "\t|" + (p ^ q) + "\t|" + (!p) + "\t|");

		p = false;
		q = true;
		System.out.println("|------\t|------\t|------\t|------\t|------\t|-------|");
		System.out.println(
				"|" + p + "\t|" + q + "\t|" + (p & q) + "\t|" + (p | q) + "\t|" + (p ^ q) + "\t|" + (!p) + "\t|");

		p = true;
		q = false;
		System.out.println("|------\t|------\t|------\t|------\t|------\t|-------|");
		System.out.println(
				"|" + p + "\t|" + q + "\t|" + (p & q) + "\t|" + (p | q) + "\t|" + (p ^ q) + "\t|" + (!p) + "\t|");
		System.out.println();

		p = false;
		q = false;
		System.out.println("Logical table with 1 & 0 values:");
		System.out.println("| p\t| q\t| p & q\t| p | q\t| p ^ q\t|!p     |");
		System.out.println("|------\t|------\t|------\t|------\t|------\t|-------|");
		System.out.println("|" + booleanToInt(p) + "\t|" + booleanToInt(q) + "\t|" + booleanToInt(p & q) + "\t|"
				+ booleanToInt(p | q) + "\t|" + booleanToInt(p ^ q) + "\t|" + booleanToInt(!p) + "\t|");

		p = true;
		q = true;
		System.out.println("|------\t|------\t|------\t|------\t|------\t|-------|");
		System.out.println("|" + booleanToInt(p) + "\t|" + booleanToInt(q) + "\t|" + booleanToInt(p & q) + "\t|"
				+ booleanToInt(p | q) + "\t|" + booleanToInt(p ^ q) + "\t|" + booleanToInt(!p) + "\t|");

		p = false;
		q = true;
		System.out.println("|------\t|------\t|------\t|------\t|------\t|-------|");
		System.out.println("|" + booleanToInt(p) + "\t|" + booleanToInt(q) + "\t|" + booleanToInt(p & q) + "\t|"
				+ booleanToInt(p | q) + "\t|" + booleanToInt(p ^ q) + "\t|" + booleanToInt(!p) + "\t|");

		p = true;
		q = false;
		System.out.println("|------\t|------\t|------\t|------\t|------\t|-------|");
		System.out.println("|" + booleanToInt(p) + "\t|" + booleanToInt(q) + "\t|" + booleanToInt(p & q) + "\t|"
				+ booleanToInt(p | q) + "\t|" + booleanToInt(p ^ q) + "\t|" + booleanToInt(!p) + "\t|");

	}

	public static int booleanToInt(boolean value) {
		return value ? 1 : 0;
	}

}
