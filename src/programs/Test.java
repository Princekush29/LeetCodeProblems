package programs;

public class Test {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		// o/p - {{1,4}{2,5}{3,6}}
		int row = arr.length;
		int column = arr[0].length;
		int rotate[][] = new int[column][row];

		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {
				rotate[i][j] = arr[j][i];
			}
		}
		for (int i = 0; i < rotate.length; i++) {
			for (int j = 0; j < rotate[0].length; j++) {
				System.out.print(rotate[i][j]+ " ");
			}
			System.out.println();
		}
	}
}