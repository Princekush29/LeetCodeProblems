package leetCode;

public class GreatestCommonDivisorOfStrings1071 {

	public static void main(String[] args) {
		String str1 = "ABCABC", str2 = "ABC";

		gcdOfStrings(str1, str2);
	}

	public static String gcdOfStrings(String str1, String str2) {

		String common = "";
		for (int i = 1; i < str1.length(); i++) {
			if (!(str1.charAt(0) == str1.charAt(i))) {
				common = common + str1.charAt(i);
			} else {
				break;
			}
			common = str1.charAt(0) + common;
		}

		return "a";

	}
}
