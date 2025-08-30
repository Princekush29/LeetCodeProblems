package programs;

import java.util.Arrays;

public class TestingThoughtWorks {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 1, 1, 4, 4, 4, 4, 4 };
		System.out.println(findRepeat(arr));
	}

	public static boolean findRepeat(int arr[]) {

		int newArr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			newArr[arr[i] - 0]++;
		}
		System.out.println(Arrays.toString(newArr));
    	return false;
	}
}
