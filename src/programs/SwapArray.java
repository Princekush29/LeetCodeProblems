package programs;

import java.util.Arrays;

public class SwapArray {

	public static void main(String[] args) {
		// Method 1
		int a[] = { 1, 2, 3, 5, 4 };

		int temp = 0;
		int j = a.length - 1;

		for (int i = 0; i < a.length / 2; i++) {
			temp = a[i];
			a[i] = a[j - i];
			a[j - i] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
		// Method 2
		System.out.println("====");
		int a1[] = { 11, 22, 13, 5, 64 };
		int t = 0, k = a1.length - 1;
		for (int p = 0; p < a1.length / 2; p++) {
			temp = a1[p];
			a1[p] = a1[k];
			a1[k] = temp;
			k--;
		}
		System.out.println(Arrays.toString(a1));
	}
}