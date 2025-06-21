package leetCode;

import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters1002 {

	public static void main(String[] args) {
		String words[] = { "bella", "label", "roller" };
		System.out.println(commonChars(words));
	}

	public static List<String> commonChars(String[] words) {
		String arr[] = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			char c[] = words[i].toCharArray();
			Arrays.sort(c);
			String stringWord = new String(c);
			arr[i] = stringWord;
		}
		System.out.println(Arrays.toString(arr));

		int end = Math.min(arr[0].length(), arr[arr.length - 1].length());
		int i = 0;
		while (i < end && arr[0].charAt(i) == arr[arr.length - 1].charAt(i)) {
			i++;
		}
		System.out.println(arr[0].substring(0, i));
		return null;
	}
}
