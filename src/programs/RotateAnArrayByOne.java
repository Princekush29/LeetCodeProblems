package programs;

import java.util.Arrays;

public class RotateAnArrayByOne {

	public static void main(String[] args) {
		/*
		 * Input: arr[] = {1, 2, 3, 4, 5} Output: arr[] = {5, 1, 2, 3, 4}
		 */

		//method 1 - using one for loop
		System.out.println("Method 1");
		int arr6[] = { 1, 2, 3, 4, 5 };
		int m = 2;
		int p = 0;
		int len = arr6.length - 1;
		int temp6 = 0;
		int token = 1;
		for (int i = 0, b = 0; b < arr6.length - 1 && p < m; b++) {
			if (token == 1) {
				temp6 = arr6[i];
				token = 2;
			}
			arr6[b] = arr6[b + 1];
			if (b == arr6.length-2) {
				arr6[len] = temp6;
				p++;
				token = 1;
				b=-1;
			}
		}

		System.out.println("Output is " + Arrays.toString(arr6));

		//Method 2 - rotate once
		System.out.println("Method2");
		int arr[] = { 1, 2, 3, 4, 5 };
		int temp;
		int last_el = arr[arr.length - 1], i;

		for (i = arr.length - 1; i > 0; i--)
			arr[i] = arr[i - 1];
		arr[0] = last_el;

		for (int i1 = 0; i1 < arr.length; i1++) {
			System.out.println(arr[i1]);
		}
		//Method 2.1 
		// Rotate by k times
		System.out.println("Method 2.1");
		int arr2[] = { 1, 2, 3, 4, 5 };
		int k = 2; // rotate by 2
		int a = k;
		int arr3[] = new int[arr2.length];
		int i2;
		for (i2 = 0; i2 < k; i2++) {
			arr3[i2] = arr2[a + 1];
			a++;
		}
		for (int i3 = k, j = 0; i3 < arr2.length; i3++, j++) {
			arr3[i3] = arr2[j];
		}
		System.out.println(Arrays.toString(arr3));

		// Method 3
		System.out.println("Method3");
		int arr4[] = { 1, 2, 3, 4, 5 };
		int m1 = 2;
		int p1 = 0;
		int len1 = arr4.length - 1;
		// o/p - 3,4,5,1,2
		for (int u = 0; p1 < m1;) {
			temp = arr4[u];
			for (int b = 0; b < arr4.length - 1; b++) {
				arr4[b] = arr4[b + 1];
			}
			arr4[len1] = temp;
			p1++;

		}
		System.out.println("Output is " + Arrays.toString(arr4));
	}
}