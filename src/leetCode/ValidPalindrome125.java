package leetCode;

public class ValidPalindrome125 {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}

	public static boolean isPalindrome(String s) {
		String small = s.toLowerCase();
		String newStr = "";
		String newStr2 = "";
		for (int i = 0; i < small.length(); i++) {
			char c = small.charAt(i);
			if (c > 96 && c < 123 || c > 47 && c < 58) {
				newStr = newStr + c;
			}

		}
		for (int i = newStr.length() - 1; i >= 0; i--) {
			newStr2 = newStr2 + newStr.charAt(i);
		}
		if (newStr.equals(newStr2))
			return true;
		else
			return false;
	}

}
