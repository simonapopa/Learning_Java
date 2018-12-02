public class Sound {
	public static void main(String args[]) {
		double distance = 7.2, echo = 7.2;
		/*
		 * lightning distance computation
		 * 
		 * distance = distance * 1100; System.out.println("The lightning is " +
		 * distance);
		 */
		echo = (echo * 1100) / 2;
		distance = echo * 1100;
		System.out.printf("The sound goes one way in %s and distance is %s%n", echo, distance);
	}
}
