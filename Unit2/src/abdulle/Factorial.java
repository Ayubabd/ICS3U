package abdulle;

import java.util.Scanner;
/**
 * Factorial.java
 * This program finds the factorial numbers
 * April 5, 2017
 * @author Ayub Abdulle
 */

public class Factorial {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number !");
		int x = sc.nextInt();
		System.out.println(factorial(x));
		
		
			
		}
	/**
	 * checks if the number is a factorial number
	 * @param num - enter numbers from users input
	 * @return x - returns the factorial given number 
	 */
	 
	    public static int factorial (int x) {
	    	for (int y = x-1;y > 0; y--) {
	    		x=y*x;
	    	}
	    	return x;
	}

}
