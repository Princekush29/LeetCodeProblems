package leetCode;

import java.util.Arrays;

public class ReverseVowelsOfAString345 {

	public static void main(String[] args) {
		String s = " apG0i4maAs::sA0m4i0Gp0";
		System.out.println(s.length());
		System.out.println(reverseVowels(s));
	}

	public static String reverseVowels(String s) {
		char c, temp, d;
		char cArray[] = s.toCharArray();
		System.out.println(Arrays.toString(cArray));
		for (int i = 0, j = s.length() - 1; i < j;) {
			c = s.charAt(i);
			d = s.charAt(j);
			if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I'
					|| c == 'O' || c == 'U')) {
				i++;
				continue;
			}
			if (!(d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u' || d == 'A' || d == 'E' || d == 'I'
					|| d == 'O' || d == 'U')) {
				j--;
				continue;
			}
			temp = cArray[i];
			cArray[i] = cArray[j];
			cArray[j] = temp;
			i++;
			j--;
		}
		String s1 = new String(cArray);
		return s1;
	}
}
