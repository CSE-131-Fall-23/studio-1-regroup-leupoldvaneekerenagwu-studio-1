package studio1;

import java.util.Scanner;

public class Leapyear_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);

		System.out.println("What year?"); 
		int year = in.nextInt(); 
		
		boolean n2 = year % 4 == 0; 
		boolean n3 = year % 100 != 0; 
		boolean n4 = year % 400 ==0; 
		
		boolean n5 = n2 && (n3 || n4); 
		
		System.out.print(year + " is a leap year:" + boole
		
	}

}
