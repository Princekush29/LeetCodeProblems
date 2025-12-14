package leetCode;

import java.util.Arrays;

public class CheckNumbersAscendingSentence2042 {

	public static void main(String[] args) {
		String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
		System.out.println(areNumbersAscending(s));
	}

	public static boolean areNumbersAscending(String s) {

		String[] arr = s.split(" ");
		int newarr[] = new int[arr.length];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i].charAt(0) >= 47 && arr[i].charAt(0) <= 57) {
				newarr[j] = Integer.parseInt(arr[i]);
				j++;
			}
		}
		System.out.println(Arrays.toString(newarr));
		int count = 0, newcount = 0;
		for (int i = 0; i < newarr.length; i++) {
			if (newarr[i] != 0)
				count++;
		}
		for (int i = 0; i < count - 1; i++) {
			if (newarr[i] < newarr[i + 1])
				newcount++;
		}
		if (count - 1 == newcount)
			return true;
		return false;
	}
}