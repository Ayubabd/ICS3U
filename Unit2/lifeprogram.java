package abdulle
/**
 * Allows user to play Conway's game of life
 * Life.java
 * @author Ayub Abdulle
 * 5/8/17
 */
public class Life {

	public static void main(String[] args) {
		String nextDay;
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[20][20];
		System.out.println("Please enter the amount of alive cells");
		int numAliveCells = sc.nextInt();
		int y;
		int x;
		System.out.println("Enter the arr of the alive cells shown");
		// assigns location of alive cells
		for (int i = 1; i <= numAliveCells; i++) {
			System.out.println("Enter an x coordinate from (0-20)");
			x = sc.nextInt();
			System.out.println("Enter a y  coordinate from (0-20)");
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
					
					
					//checks if cell is alive
					//if the method is true, cells would become 1 or stay alive
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
			System.out.println("Would you like to continue to to the next day? (Type 'yes' or 'no')");
			nextDay = sc.nextLine();
		} while (nextDay.equalsIgnoreCase("yes"));
	}

	/**
	 * Checks if the cell should be alive
	 * @param arr - the array would be checked
	 * @param row - rows of the array shown
	 * @param column - column of the array shown
	 * @return - true if appropriate amount of neighbours, false if not
	 */
	private static boolean isCellAlive(int[][] arr, int row, int column) {

		// If the current cell is alive
		boolean cellAlive = arr[row][column] == 1;

		int numOfNeighbours = 0;

		// check one to the right of column
		if (arr[row].length > column + 1) {
			if (arr[row][column + 1] == 1) {
				numOfNeighbours++;
			}
		}
		// check one to the left of column
		if (arr[row].length > column - 1 && column - 1 >= 0) {
			if (arr[row][column - 1] == 1) {
				numOfNeighbours++;
			}
		}

		// check one above column
		if (arr.length > row - 1 && row - 1 >= 0) {
			if (arr[row - 1][column] == 1) {
				numOfNeighbours++;
			}
		}

		// check one below column
		if (arr.length > row + 1) {
			if (arr[row + 1][column] == 1) {
				numOfNeighbours++;
			}
		}

		// check one top left diagonal to column
		if (arr.length > row - 1 && arr[row].length > column - 1 && row - 1 >= 0 && column - 1 >= 0) {
			if (arr[row - 1][column - 1] == 1) {
				numOfNeighbours++;
			}
		}

		// check one top right diagonal to column
		if (arr.length > row - 1 && arr[row].length > column + 1 && row - 1 >= 0) {
			if (arr[row - 1][column + 1] == 1) {
				numOfNeighbours++;
			}
		}

		// check one bottom left diagonal to column
		if (arr.length > row + 1 && arr[row].length > column - 1 && column - 1 >= 0) {
			if (arr[row + 1][column - 1] == 1) {
				numOfNeighbours++;
			}
		}

		// check one bottom right diagonal to column
		if (arr.length > row + 1 && arr[row].length > column + 1) {
			if (arr[row + 1][column + 1] == 1) {
				numOfNeighbours++;
			}
		}

		// if the cell has 2 neighbours and its already alive returns true
		// if its not alive and it has 3 neighbours, returns true
		if ((numOfNeighbours == 2) && cellAlive) {
			return true;
		} else if (numOfNeighbours == 3) {
			return true;
		}
		return false;
	}

}
