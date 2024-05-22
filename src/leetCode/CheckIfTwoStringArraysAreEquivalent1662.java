package leetCode;

public class CheckIfTwoStringArraysAreEquivalent1662 {

	public static void main(String[] args) {

		String word1[] = { "ab", "c" }, word2[] = { "a", "bc" };
		System.out.println(arrayStringsAreEqual(word1, word2));
	}

	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

		String s1 = concatString(word1);
		String s2 = concatString(word2);
		return s1.equals(s2);
	}

	public static String concatString(String[] word1) {
		String newStr = "";
		for (int i = 0; i < word1.length; i++) {
			newStr = newStr + word1[i];
		}
		return newStr;

	}
}
