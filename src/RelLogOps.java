
public class RelLogOps {
	public static void main(String args[]) {
		int i, j, x;
		boolean b1, b2, b3;

		i = x = 10;
		j = 11;
		if (i < j)
			System.out.print("i<j");
		else
			System.out.print("\ni < j");
		if (i <= j)
			System.out.print("\ni<=j");
		if (i != j)
			System.out.print("\ni!=j");
		if (i == x)
			System.out.print("\ni==j");
		if (j >= i)
			System.out.print("\nj>=i");
		if (j > i)
			System.out.print("\ni>j");

		b1 = true;
		b2 = false;
		b3 = true;
		if (b1 & b3)
			System.out.println("b1 & b3 is " + b1);
		if (!(b1 & b2))
			System.out.println("\n!(b1 & b2) is " + b1);
		if (b1 | b2)
			System.out.println("b1 | b2 is " + b1);
		if (b1 ^ b2)
			System.out.println("b1 ^ b2 is " + b1);
	}
}
