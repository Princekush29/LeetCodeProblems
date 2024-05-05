package leetCode;

public class IsSubsequence392 {

	public static void main(String[] args) {
		System.out.println("Hello");
		String s = "bcd";
		String t = "ubcd";
		System.out.println(isSubsequence(s, t));
	}

	public static boolean isSubsequence(String s, String t) {
		int i = 0, j = 0;
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
				j++;
			} else {
				j++;
			}
		}
		if (i == s.length()) {
			return true;
		}

		return false;
	}
}