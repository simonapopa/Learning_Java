
public class LogicalOpTable {
	public static void main(String args[]) {
		int p, q;
		boolean i;
		boolean p1, q1;	

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
		System.out.println();
		
		
		
				
		p1 = false;
		q1 = false;
		System.out.println("| p\t| q\t| p & q\t| p | q\t| p ^ q\t|!p     |");
		System.out.println("|------\t|------\t|------\t|------\t|------\t|-------|");
		System.out.println(
				"|" + p1 + "\t|" + q1 + "\t|" + (p1 & q1) + "\t|" + (p1 | q1) + "\t|" + (p1 ^ q1) + "\t|" + (!p1) + "\t|");
		//System.out.printf("|" + p1 + "\t|" + q1 + "\t|", p1 && q1 ? 1 : 0,"\t|",p1 || q1 ? 1 : 0,"\t|" + (p1 ^ q1) + "\t|",!p1 ? 1:0,"\t|");

		p1 = true;
		q1 = true;
		System.out.println("|------\t|------\t|------\t|------\t|------\t|-------|");
		System.out.println(
				"|" + p1 + "\t|" + q1 + "\t|" + (p1 & q1) + "\t|" + (p1 | q1) + "\t|" + (p1 ^ q1) + "\t|" + (!p1) + "\t|");

		p1 = false;
		q1 = true;
		System.out.println("|------\t|------\t|------\t|------\t|------\t|-------|");
		System.out.println(
				"|" + p1 + "\t|" + q1 + "\t|" + (p1 & q1) + "\t|" + (p1 | q1) + "\t|" + (p1 ^ q1) + "\t|" + (!p1) + "\t|");

		p1 = true;
		q1 = false;
		System.out.println("|------\t|------\t|------\t|------\t|------\t|-------|");
		System.out.println(
				"|" + p1 + "\t|" + q1 + "\t|" + (p1 & q1) + "\t|" + (p1 | q1) + "\t|" + (p1 ^ q1) + "\t|" + (!p1) + "\t|");
				
	
	}
}
