package abdulle;

import java.util.Scanner;


public class Gcf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter your first number");
		int a = sc.nextInt();
		System.out.println(" Please enter your second number");
		int b = sc.nextInt();
		System.out.print("The greatest common factor of these numers is "+gCF(a,b));
		
		
		 
		
	    

	}
	/**
	 * Finds the gCF numbers
	 * @param user inputs a number
	 * @return the gCF of the number
	 */
	public static int gCF (int a, int b){
		if (a>b) {
			for (int i = a; i>0;i--){
				if (isDivisible(a,b) == true){
					return i;
				}
				
			}
		}
		if (b>a){
			for (int i = b; i >0;i--)
			{
				if(isDivisible(b,i)==true&& isDivisible(a,i)==true) {
					return i;
					
				}
			}
		}
	
	 return a;
	}

public static boolean isDivisible(int a, int b) {
	if (a%b == 0) {
		return true;
	}
	return false;
		
	}
}

