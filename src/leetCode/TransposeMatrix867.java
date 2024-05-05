package leetCode;

import java.util.Arrays;

public class TransposeMatrix867 {

	public static void main(String[] args) {
		 int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		//int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(transpose(matrix));
	}

	public static int[][] transpose(int[][] matrix) {
		int newMatrix[][] = new int[matrix[0].length][matrix.length];

		System.out.println("Row is " + newMatrix.length);
		System.out.println("Column is " + newMatrix[0].length);
		System.out.println("---");
		System.out.println("Row is " + matrix.length);
		System.out.println("Column is " + matrix[0].length);
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				newMatrix[i][j] = matrix[j][i];
				System.out.println(newMatrix[i][j]);
			}
		}
		System.out.println(Arrays.toString(newMatrix));
		return newMatrix;
	}
}