package leetCode;

import java.util.Arrays;

public class RotateImage48 {
	public static void main(String[] args) {
		System.out.println("Hello");
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate(matrix);
	}

	public static void rotate(int[][] matrix) {
		int rotateMatrix[][] = new int[matrix.length][matrix[0].length];
		System.out.println("Length is " + matrix.length);
		int k = 0, p = 0;
		for (int i = 0; i < matrix.length; i++) {
			p = 0;
			for (int j = matrix[i].length - 1; j >= 0; j--) {
				rotateMatrix[k][p] = matrix[j][i];
				p++;
			}
			k++;
		}
		System.out.println("Hello" + Arrays.toString(rotateMatrix));

	}
}