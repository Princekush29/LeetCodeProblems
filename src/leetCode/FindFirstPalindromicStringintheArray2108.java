package leetCode;

public class FindFirstPalindromicStringintheArray2108 {

	public static void main(String[] args) {
		String words[] = { "abc", "car", "ada", "racecar", "cool" };
		System.out.println(firstPalindrome(words));
	}

	public static String firstPalindrome(String[] words) {

		for (int i = 0; i < words.length; i++) {
			int len = words[i].length();
			for (int k = len - 1, j = 0; k >= len / 2; k--, j++) {
				if (!(words[i].charAt(k) == words[i].charAt(j))) {
					break;
				}
				if (k == len / 2)
				return words[i];
				
			}
		}
		return "";
	}
}