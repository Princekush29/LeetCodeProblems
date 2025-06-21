package leetCode;

public class FindFirstPalindromicStringintheArray2108 {

	public static void main(String[] args) {
		String words[] = { "xngla", "e", "itrn", "y", "s", "pfp", "rfd" };
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
		/*
		 * int count=0; for (int i = 0; i < words.length; i++) { int a =
		 * words[i].length(); System.out.println(a);
		 * 
		 * for (int j = 0, k = words[i].length() - 1; j < words[i].length() / 2;
		 * j++,k--) { if (words[i].charAt(j) == words[i].charAt(k)) { count++; } else {
		 * break; } if (count == words[i].length() /2) return words[i]; } }
		 * return "";
		 */

		
	}
}