package programs.String;

import java.util.Arrays;

public class CountInString {

	public static void main(String[] args) {

		String s = "AAAaaa";
		// Method1
		int count[] = new int[256];

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] > 0) {
				char c = (char) i;
				System.out.println(c + " " + count[i]);
			}
		}

		String str = "aabbccppqq";
		String str1 = "1122344";

		int characters[] = new int[26];
		int numbers[] = new int[10];

		for (int i = 0; i < str.length(); i++) {
			characters[str.charAt(i) - 'a']++;
		}

		for (int i = 0; i < str1.length(); i++) {
			numbers[str1.charAt(i) - '0']++;
		}
		System.out.println(Arrays.toString(characters));
		System.out.println(Arrays.toString(numbers));

		int arr[] = { 1, 2, 3, 4, 1, 2, 4, 1, 2 };
		int num[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			num[arr[i] - 0]++;
			// num[arr[i]]++;
		}
		System.out.println(Arrays.toString(num));
	}
}
