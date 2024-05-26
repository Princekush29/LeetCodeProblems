package leetCode;

import java.util.Arrays;

public class NumberOfValidWordsInASentence2047 {

	public static void main(String[] args) {

		String sentence = "q-,";
		System.out.println(countValidWords(sentence));
	}

	public static int countValidWords(String sentence) {
		sentence = sentence.trim().replaceAll(" +", " ");
		String arr[] = sentence.split(" ");
		System.out.println("Array is " + Arrays.toString(arr));
		int hypen = 0, punctuation = 0, count = 0;
		for (int i = 0; i < arr.length; i++) {
			hypen = 0;
			punctuation = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				char c = arr[i].charAt(j);
				if (c == '-')
					hypen++;
				if (j > 0 && j < arr[i].length() - 1) {
					char d = arr[i].charAt(j - 1);
					char e = arr[i].charAt(j + 1);
					if ((c == '-') && !((d >= 97 && d <= 122) && (e >= 97 && e <= 122)))
						break;
				}
				if (c == ',' || c == '!' || c == '.')
					punctuation++;
				if (hypen > 1 || punctuation > 1)
					break;
				if ((c >= 65 && c <= 90) || (c >= 48 && c <= 58))
					break;
				if (arr[i].charAt(0) == '-' || arr[i].charAt(arr[i].length() - 1) == '-')
					break;
				if ((c == ',' || c == '!' || c == '.') && (j != arr[i].length() - 1))
					break;

				if (j == arr[i].length() - 1) {
					System.out.println(arr[i]);
					count++;
				}

			}
		}
		return count;
	}
}