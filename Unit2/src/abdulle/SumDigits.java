package abdulle;

import java.util.Scanner;
/**
 * SumDigits.java
 * This program finds the sum of digits
 * April 5, 2017
 * @author Ayub Abdulle
 */


public class SumDigits{
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println("The sum of digits is "+sumOfDigits(num));
		
		
	

	}
	/**
	 * checks if the numbers entered by users
	 * @param num - enter numbers from users input
	 * @return x - returns the sum of digits 
	 */
	public static int sumOfDigits(int num){
		int sum = 0;
		while (num> 0 )
		{	
			sum = sum + num %10;
			num = num / 10;
			
	}
	return sum;
	

}
}