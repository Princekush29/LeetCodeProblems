package leetCode;

public class RepeatedSubstringPattern459 {

	public static void main(String[] args) {

		String s = "abab";
		System.out.println(repeatedSubstringPattern(s));
	}

	public static boolean repeatedSubstringPattern(String s) {
		// Method 1

		String s1 = "";
		int len = s.length();
		for (int i = 1; i <= len / 2; i++) {
			if (len % i == 0) {
				s1 = s.substring(0, i);
				StringBuilder repeated = new StringBuilder();
				for (int j = 0; j < len / i; j++) {
					repeated.append(s1);
				}
				if (s.equals(repeated.toString()))
					return true;
			}
		}
		return false;

		// Method 2
		/*
		 * String doubled = s + s; System.out.println(s); String sub =
		 * doubled.substring(1, doubled.length() - 1); System.out.println(sub); return
		 * sub.contains(s);
		 */
	}
}