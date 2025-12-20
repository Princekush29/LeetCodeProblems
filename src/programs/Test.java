package programs;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		int a1[] = { 1, 2, 3, 4, 6 }; // [6, 4, 5, 3, 2, 1]
		int temp;
		int len = a1.length;
		System.out.println(len);
		for (int i = 0, j = a1.length - 1; i < a1.length / 2; i++, j--) {
			temp = a1[i];
			a1[i] = a1[j];
			a1[j] = temp;
		}
		System.out.println(Arrays.toString(a1));
	}
}
