package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for arg 0: ");
		String name1 = in.nextLine();
		System.out.print("Enter value for arg 1: ");
		String name2 = in.nextLine();
		System.out.print("Enter value for arg 2: ");
		String name3 = in.nextLine();
		System.out.print("Enter value for arg 3: ");
		String name4 = in.nextLine();
		
		System.out.print("Greetings " + name1 + ", " + name2 + ", " + name3 + ", " + name4);
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
