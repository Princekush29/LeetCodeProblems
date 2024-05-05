package leetCode;

import java.util.Arrays;

public class ShortestDistanceToACharacter821 {

	public static void main(String[] args) {
		String s = "cizokxcijwbyspcfcqws";
		// [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
		char c = 'c';
		shortestToChar(s, c);
	}

	public static int[] shortestToChar(String s, char c) {
		int token = s.indexOf(c);
		int token1 = 0;
		int token2 = s.indexOf(c, token);

		System.out.println(token2);
		System.out.println(token);

		int arr1[] = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				arr1[i] = 0;
				token1 = token;
				token = i;
				/*
				 * token2 = s.indexOf(c, token); System.out.println(token2);
				 */
			} else {
				if (token1 > 0) {
					int a = Math.abs(i - token);
					int b = Math.abs(i - token1);
					int d = Math.abs(i - token2);
					int e = Math.min(a, b);
					arr1[i] = Math.min(e, d);
				} else if (token2 > 0) {
					int a = Math.abs(i - token);
					int b = Math.abs(i - token2);
					arr1[i] = Math.min(a, b);
				} else {
					arr1[i] = Math.abs(i - token);
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		return arr1;

	}
}