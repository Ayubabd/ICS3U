package abdulle;

import java.util.Scanner;

/** Backwards Sentence Program
 * April 7. 2017
 * @author Ayub Abdulle
 */


public class Backwordsentence {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner (System.in);
		String[] x = sc.nextLine().split("");
				for (int i = x.length-1; i>=0; i--){
					System.out.print(x[i]+"");
				}
		
					
		}
}
