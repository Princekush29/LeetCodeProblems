package programs;

public class RemoveTrailingZerosFromString2710 {

	public static void main(String[] args) {
		System.out.println("hello "+ removeTrailingZeros("512301000"));
		/*
		 * Problem : Given a positive integer num represented as a string, return the
		 * integer num without trailing zeros as a string. i/p - 51230100 o/p1 - 512301
		 * - remove traling zeros o/p2 - 51231 - remove all zeros
		 */

		// Method1 - remove all zeros
		String str = "512301000";
		String newStr1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (!(str.charAt(i) == '0')) {
				newStr1 = newStr1 + str.charAt(i);
			}
		}

		System.out.println("New Str is " + newStr1);

		// Method 2 - remove all zeros
		str = str.replaceAll("0", "");
		System.out.println("str is " + str);

		// Method 1 - remove zeros from end
		for (int i = str.length() - 1; i >= 0; i--) {
			if (!(str.charAt(i) == '0')) {
				System.out.println(str.substring(0, i + 1));
				break;
			}
		}
	}

	public static String removeTrailingZeros(String num) {
		int i ;
		for (i = num.length() - 1; i >= 0; i--) {
			if (!(num.charAt(i) == '0'))
				break;
		}
		return num.substring(0, i + 1);
	}
}