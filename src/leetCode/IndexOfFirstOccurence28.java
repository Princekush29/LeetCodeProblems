package leetCode;

public class IndexOfFirstOccurence28 {

	public static void main(String[] args) {
		String haystack = "mississippi", needle = "issip";
		System.out.println(strStr(haystack, needle));
	}

	public static int strStr(String haystack, String needle) {
		int value = 0;
		if (haystack.contains(needle)) {
			for (int i = 0; i < haystack.length(); i++) {
				if (needle.charAt(0) == haystack.charAt(i)) {
					if (needle.equals(haystack.substring(i, i + needle.length()))) {
						value = i;
						break;
					}
				}
			}
		} else {
			return -1;
		}

		return value;
	}
}