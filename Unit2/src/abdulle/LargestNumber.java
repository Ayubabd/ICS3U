package abdulle;

import java.util.Scanner;
/**
 * LargestNumber.java
 * This program finds the largest numbers
 * April 5, 2017
 * @author Ayub Abdulle
 */

public class LargestNumber {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("please enter 6 numbers");
		int [] num = new int [6];
		for (int i = 0;i<num.length;i++)  {
			num [i] = sc.nextInt();
			
		}
		System.out.println("the largest number is "+highestNum(num)); 
		

	}
	/**
	 * Gets the highest number from the array of integers
	 * @param num - array of numbers
	 * @return x - the biggest number
	 */
	public static int highestNum(int [] num){
		int x = num [0];
		for (int i = 1; i< num.length;i++){
			x=Math.max(x, num[i]);
			
		}
		return x;
	}
	

}
