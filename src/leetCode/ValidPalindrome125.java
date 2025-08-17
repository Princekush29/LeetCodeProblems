package leetCode;

public class ValidPalindrome125 {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}

	public static boolean isPalindrome(String s) {
		//use regular expression 
		String small = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

		for (int i = 0, j = small.length() - 1; i < j; i++, j--) {
			if (small.charAt(i) != small.charAt(j))
				return false;

		}
		return true;
	}

}
