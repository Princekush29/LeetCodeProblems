package leetCode;

public class GreatestCommonDivisorOfStrings1071 {

	public static void main(String[] args) {
		String str1 = "ABCABC", str2 = "ABC";

		System.out.println("Output is " + gcdOfStrings(str1, str2));
	}

	public static String gcdOfStrings(String str1, String str2) {

		if (!(str1 + str2).equals(str2 + str1)) {
			return "";
		}
		int lenGCD = gcd(str1.length(), str2.length());
		return str1.substring(0, lenGCD);

	}

	public static int gcd(int len1, int len2) {
		while (len2 != 0) {
			int temp = len1 % len2;
			len1 = len2;
			len2 = temp;
		}
		System.out.println("Len 1 is " + len1);
		return len1;

	}
}
