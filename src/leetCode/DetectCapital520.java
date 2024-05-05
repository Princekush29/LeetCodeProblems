package leetCode;

public class DetectCapital520 {

	public static void main(String[] args) {
		String word = "Leetcode";
		System.out.println(detectCapitalUse(word));
	}

	public static boolean detectCapitalUse(String word) {
		int j = 0, k = 0;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (c >= 65 && c <= 90) {
				j++;
				if (i == 0) {
					k++;
				}
			} else if (c >= 97 && c <= 122) {
				k++;
			}
		}
		if (j == word.length() || k == word.length())
			return true;
		else
			return false;

	}
}