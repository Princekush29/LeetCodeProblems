package programs;

import java.util.Arrays;

public class SwapArray {

	public static void main(String[] args) {

		// Method 1
		int a1[] = { 1, 2, 3, 5, 4, 6 };
		int len = a1.length;
		int temp;
		for (int i = 0, j = len - 1; i < len / 2; i++, j--) {
			temp = a1[i];
			a1[i] = a1[j];
			a1[j] = temp;
		}
		System.out.println(Arrays.toString(a1));

		// Method2
		int a[] = { 1, 2, 3, 5, 4 };

		int temp1 = 0;
		int j = a.length - 1;

		for (int i = 0; i < a.length / 2; i++) {
			temp1 = a[i];
			a[i] = a[j - i];
			a[j - i] = temp1;
		}
		/*
		 * for (int i = 0; i < a.length; i++) { System.out.println(a[i]); }
		 */
		System.out.println(Arrays.toString(a));
		// Method 3
		System.out.println("====");
		int a11[] = { 11, 22, 13, 5, 64 };
		int t = 0, k = a11.length - 1;
		for (int p = 0; p < a11.length / 2; p++) {
			t = a11[p];
			a11[p] = a11[k];
			a11[k] = t;
			k--;
		}
		System.out.println(Arrays.toString(a11));
	}
}