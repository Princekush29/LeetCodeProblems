package programs;

import java.util.Arrays;

public class SwapArray {

	public static void main(String[] args) {

		// Method 1
		int a1[] = { 1, 2, 3, 5, 4, 6 }; // [6, 4, 5, 3, 2, 1]
		int len = a1.length;
		int temp;
		for (int i = 0, j = len - 1; i < len / 2; i++, j--) {
			temp = a1[i];
			a1[i] = a1[j];
			a1[j] = temp;
		}
		System.out.println(Arrays.toString(a1));
	}
}