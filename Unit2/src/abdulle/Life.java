package abdulle;

import java.util.Scanner;
/**
 * Life Assignment
 * April 26, 2017
 * @author Ayub Abdulle
 */


public class Life {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int [][] arr = new int[20][20];
		int [][] newGrid = new int [20][20];
		String nextDay;
		System.out.println("Enter the amount of alive cells");
		int numAliveCells = sc.nextInt();
		int row;
		
		int coloumn;
		System.out.println("Enter the coordinates of the alive cells");
		for ( int x = 1; x<= numAliveCells; x++) {
			System.out.println("enter x coordinates from (0-20)");
			coloumn = sc.nextInt();
			System.out.println("Enter y coordinate from (0-20)");
			row = sc.nextInt();
			arr[row][coloumn] = 1;
			
					
	}
		System.out.println("Original:/n/n");
		for (int i = 0; i < arr.length; i++);
		for (int j = 0; j < arr[i].length; j++);
		System.out.print(arr[i][j]);;
		
		}
	System.out.println();
	

}
sc.nextLine();
do {
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++);
		if(aliveCell(arr));
		      newGrid[i][j]=1;
	}
	else if(aliveCell(arr)==false); {
		newGrid [i][j]
	}
	if (deadCell(arr)){
		
	}
}