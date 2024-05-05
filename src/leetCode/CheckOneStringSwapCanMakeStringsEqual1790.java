package leetCode;

public class CheckOneStringSwapCanMakeStringsEqual1790 {

	public static void main(String[] args) {
		String s1 = "aa", s2 = "ac";
		System.out.println(areAlmostEqual(s1, s2));
	}

	public static boolean areAlmostEqual(String s1, String s2) {

		if (s1.equals(s2))
			return true;
		if (s1.length() != s2.length())
			return false;
		int sum1 = 0, sum2 = 0;
		for (int i = 0, j = 0; i < s1.length() && j < s2.length(); i++, j++) {
			sum1 = sum1 + s1.charAt(i);
			sum2 = sum2 + s2.charAt(j);

			if (!(s1.charAt(i) == s2.charAt(i))) {
				char c = s1.charAt(i);
				char d = s2.charAt(i);
				s2 = s2.replace(c, d);
				s1 = s1.replace(c, d);
				break;
			}

		}
		System.out.println(sum1);
		if (sum1 == sum2)
			return true;
		return false;
	}
}