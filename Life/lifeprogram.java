package abdulle;
/**
 * Allows user to play Conway's game of life
 * Life.java
 * @author Ayub Abdulle
 * 4/28/17
 */

public class lifeprogram {

	public static void main(String[] args) {
		String nextDay;
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[20][20];
		System.out.println("Enter the amount of alive cells");
		int numAliveCells = sc.nextInt();
		int y;
		int x;
		System.out.println("Enter the arr of the alive cells");
		// assigns location of alive cells
		for (int i = 1; i <= numAliveCells; i++) {
			System.out.println("Enter x coordinate from (0-20)");
			x = sc.nextInt();
			System.out.println("Enter y coordinate from (0-20)");
			y = sc.nextInt();
			arr[y][x] = 1;
		}
		System.out.println("\n\nGeneration 1:\n");
		for (int row = 0; row < arr.length; row++) {
			for (int j = 0; j < arr[row].length; j++) {
				System.out.print(arr[row][j]);
			}
			System.out.println();
		}
		sc.nextLine();
		int generation = 1;
		do {
			generation++;
			int[][] newGrid = new int[20][20];

			for (int row = 0; row < arr.length; row++) {
				for (int j = 0; j < arr[row].length; j++) {
					//goes into isCellAlive method and checks neighbours
					//if the method is true, cells become 1 or stay alive
					//if false becomes dead or stays dead
					if (isCellAlive(arr, row, j)) {
						newGrid[row][j] = 1;
					} else {
						newGrid[row][j] = 0;
					}

				}
			}
			// draws the next generation
			arr = newGrid;
			System.out.println("\n\nGeneration: " + generation + "\n");
			for (int row = 0; row < arr.length; row++) {
				for (int j = 0; j < arr[row].length; j++) {
					System.out.print(arr[row][j]);
				}
				System.out.println();
			}
			// if user wants to continue to next day, goes to start of do/while loop
			System.out.println("Continue to to the next day? (Type 'yes' or 'no')");
			nextDay = sc.nextLine();
		} while (nextDay.equalsIgnoreCase("yes"));
	}

	/**
	 * Checks if the cell should be alive 
	 * @param arr - the array which will be checked
	 * @param row - row of the array
	 * @param column - column of the array
	 * @return - true if appropriate amount is found, false if not
	 */
	private static boolean isCellAlive(int[][] arr, int row, int column) {

		// If the current cell is alive
		boolean cellAlive = arr[row][column] == 1;

		int numOfNeighbours = 0;

		// check one to the right of column
		if (arr[row].length > column + 1) {
		
	}

}
