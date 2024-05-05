package leetCode;

public class CheckIfStringIsPrefixArray1961 {

	public static void main(String[] args) {

		String s = "iloveleetcode";
		String words[] = { "i", "love", "leetcode", "apples" };
		System.out.println(isPrefixString(s, words));
	}

	public static boolean isPrefixString(String s, String[] words) {
		String newStr = "";
		for (int i = 0; i < words.length; i++) {
			newStr = newStr + words[i];
			if (newStr.equals(s))
				return true;
		}

		return false;

	}
}
