package leetCode;

public class FirstUniqueCharacterInAString387 {

	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(firstUniqChar(s));
	}

	public static int firstUniqChar(String s) {
		int j;
		for (int i = 0; i < s.length(); i++) {
			for (j = 0; j < s.length(); j++) {
				if (!(i == j)) {
					if (s.charAt(i) == s.charAt(j))
						break;
				}
			}
			if (j == s.length()) {
				return i;
			}
		}
		return -1;
	}
}