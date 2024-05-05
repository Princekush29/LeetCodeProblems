package leetCode;

public class CountNegativeNumbersSortedMatrix1351 {

	public static void main(String[] args) {
		int grid[][] = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
		System.out.println(countNegatives(grid));
	}

	public static int countNegatives(int[][] grid) {

		System.out.println("Row is " + grid.length);
		System.out.println("Column is " + grid[0].length);
		System.out.println(grid);
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = grid[0].length - 1; j >= 0; j--) {
				System.out.println(grid[i][j]);
				if (grid[i][j] < 0)
					count++;
				else
					break;
			}
		}
		return count;

	}
}
