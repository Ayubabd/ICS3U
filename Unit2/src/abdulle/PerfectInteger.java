package abdulle;
/**
 * PerfectInteger
 * April 26, 2017
 * @author Ayub Abdulle
 */

public class PerfectInteger {

	public static void main(String[] args) {
		for ( int x = 1; x < 100; x++) {
			if (isPerfect(x)) {
				System.out.println(x);
			}
		}
	}

	 /**
	  * It will determine if a number is perfect by gathering its factors and adding it
	  * It will then continue to compare the added factors to its original number
	  * @param a - number that is checking whether if it is perfect or not
	  * 
	  */
    public static boolean isPerfect(int a) {
	       int x = 0; 
	       for ( int i = 1; i<a; i++) {
	    	   if (a%i==0) {
	    		   x=x+i;
	    	   }
	       
	       }
	       if (x == a) {
	    	   return true;
	    			   
	       }
	       return false;
}
}

 
	 
