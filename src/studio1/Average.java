package studio1;

import java.util.Scanner; 

public class Average {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("What is the first integer?");
		int n1 = in.nextInt(); 
		
		System.out.println("What is the second integer?"); 
		int n2 = in.nextInt(); 
		
		System.out.print("The average of the two integers is " + (double)(n1 + n2) / 2 + "."); 
	}

}
