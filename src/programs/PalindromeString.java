package programs;

public class PalindromeString {

	public static void main(String[] args) {

		// Method 1
		String actualString = "bob", reverseString = "";

		for (int i = actualString.length() - 1; i >= 0; i--) {
			reverseString = reverseString + actualString.charAt(i);

		}
		System.out.println(reverseString);
		if (actualString.equals(reverseString)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("NOT");
		}

		// Method 2
		String s = "abcdcba";
		int i, j;
		for (i = 0, j = s.length() - 1; i < s.length() / 2;) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				System.out.println("Not Palindrome");
				break;
			}
		}
		if (i == s.length() / 2)
			System.out.println("Palindrome");
	}
}
