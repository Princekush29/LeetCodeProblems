package programs.String;

import java.util.Arrays;

public class Test1111 {

	public static void main(String[] args) {

		int a1[] = { 1, 2, 3, 5, 4, 6 }; // [6, 4, 5, 3, 2, 1]
		for (int i = 0; i < a1.length / 2; i++) {
			int temp = a1[i];
			a1[i] = a1[a1.length-1-i];
			a1[a1.length-1-i] = temp;
		}
		System.out.println(Arrays.toString(a1));
	}
}