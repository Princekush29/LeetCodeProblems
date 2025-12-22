package programs;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String s1 = "I Am Not String"; // g ni rtS toNmAI
		// char arr[] = s1.toCharArray();
		char arr[] = new char[s1.length()];
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ') {
				arr[i] = ' ';
			}
		}
		System.out.println();
		for (int i = 0, j = s1.length() - 1; j >= 0 && i < s1.length();) {
			if (arr[i] == ' ') {
				i++;
			} else if (s1.charAt(j) == ' ') {
				j--;
			} else {

				arr[i] = s1.charAt(j);
				i++;
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}