package abdulle;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (	System.in);
		System.out.println(" Please enter a number !");
		int num = sc.nextInt();
		if (primeNum(num)==true){
			System.out.println(" This is a prime number !");
			
			
		}
		else {
			System.out.println("This is not a prime number ! ");
			
		 

	}
}
/**
 * checks if the number is a prime number 
 * @param num - enter numbers from users input
 * @return x - returns true or false 
 */
    
	public static boolean isDivisible(int a, int b) {
		if (a%b == 0) {
			return true;
		}
		return false;
	
	}
	
	public static boolean primeNum(int num) {
		for (int i = 2; i< num; i++) {
			if ( isDivisible(num, i)==true) {
				return false;
				
			}
		}
		return true;
	}
}
