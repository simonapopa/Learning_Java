
public class LogicalOpTableBinary {

	public static void main(String[] args) {
		int p, q;
		boolean i;

		p = 0;
		q = 0;
		i = false;
		System.out.println("| p\t| q\t| p & q\t| p | q\t| p ^ q\t|!p     |");
		System.out.println("|------\t|------\t|------\t|------\t|------\t|-------|");
		System.out.println(
				"|" + p + "\t|" + q + "\t|" + (p & q) + "\t|" + (p | q) + "\t|" + (p ^ q) + "\t|" + (!i) + "\t|");
		
		p = 1;
		q = 1;
		i = true;
		System.out.println("|------\t|------\t|------\t|------\t|------\t|-------|");
		System.out.println(
				"|" + p + "\t|" + q + "\t|" + (p & q) + "\t|" + (p | q) + "\t|" + (p ^ q) + "\t|" + (!i) + "\t|");

		p = 0;
		q = 1;
		i = false;
		System.out.println("|------\t|------\t|------\t|------\t|------\t|-------|");
		System.out.println(
				"|" + p + "\t|" + q + "\t|" + (p & q) + "\t|" + (p | q) + "\t|" + (p ^ q) + "\t|" + (!i) + "\t|");

		p = 1;
		q = 0;
		i = true;
		System.out.println("|------\t|------\t|------\t|------\t|------\t|-------|");
		System.out.println(
				"|" + p + "\t|" + q + "\t|" + (p & q) + "\t|" + (p | q) + "\t|" + (p ^ q) + "\t|" + (!i) + "\t|");
	}

}
