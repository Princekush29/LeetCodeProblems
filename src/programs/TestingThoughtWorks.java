package programs;

import java.util.Arrays;

public class TestingThoughtWorks {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 1 };
		System.out.println(findRepeat(arr));
	}

	public static boolean findRepeat(int arr[]) {

		int numbers[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			char c = (char) arr[i];
			char d = (char) 0;
			numbers[c - d]++;
		}
		System.out.println(Arrays.toString(numbers));

		return true;
	}
}
