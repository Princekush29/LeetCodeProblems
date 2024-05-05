package leetCode;

import java.util.Arrays;

public class ReverseString344 {

	public static void main(String[] args) {
		char s[] = { 'h', 'e', 'l', 'l', 'o' };
		reverseString(s);
	}

	public static void reverseString(char[] s) {
		char temp;
		for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
			temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
		System.out.println(Arrays.toString(s));
		
		//with while loop
		/*
		 * char temp; int i = 0, j = s.length - 1; while (i < j) { temp = s[i]; s[i] =
		 * s[j]; s[j] = temp; i++; j--; } System.out.println(Arrays.toString(s));
		 */
	}
}
