package programs;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		int a1[] = { 1, 2, 5, 4, 6 }; // [6, 4, 5, 3, 2, 1]

		for (int i = 0, j = a1.length - 1; i < a1.length / 2; i++, j--) {
			int temp = a1[j];
			a1[j] = a1[i];
			a1[i] = temp;

		}
		System.out.println(Arrays.toString(a1));

	}
}
