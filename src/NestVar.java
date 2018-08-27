
public class NestVar {
	public static void main(String args[]) {
		
		for(int count=0; count<10;count++) {
			System.out.println("count="+count);
			for(count=0; count<2; count++)
				System.out.println("This program is in error!");
		}
		int count; // works!
	}
	}
	
