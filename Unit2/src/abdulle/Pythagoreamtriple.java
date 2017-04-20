package abdulle;

public class Pythagoreamtriple {
	/** Pythagorean triple
	 * April 19, 2017
	 * @author Ayub Abdulle
	 */

	public static void main(String[] args) {
		int pythagorean;
	
		for (int a=1;a<100;a++){
			for(int b=1;b<100;b++){
			pythagorean = (int)Math.pow( a,  2)+(int)Math.pow(b,  2);
			if (perfectSquare(pythagorean)){
				System.out.println(a+ "^2"+"+"+b+"^2"+"=" + (int)Math.sqrt(pythagorean)+"^2");
			}
		}
		}
	}
	/**
	 * This method would check if there is a perfect square
	 * @param n - if the value tested is a perfect square
	 * @return true or false
	 */

	

	public static boolean perfectSquare(int n){
		int x = (int)Math.sqrt (n);
		double check = Math.pow(x, 2);
		if (n==check){
			return true;
		}
		return false;
	}

}
