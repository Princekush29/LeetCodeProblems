package programs.Array;

import java.util.Arrays;

public class Convert2DArray {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		// o/p - {{1,4}{2,5}{3,6}}
		System.out.println("Arrays is " + Arrays.toString(arr));
		int row = arr.length;
		int column = arr[0].length;
		System.out.println("Row is " + row);
		System.out.println("Column is " + column);
		int arr1[][] = new int[column][row];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr1[j][i] = arr[i][j];
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
}