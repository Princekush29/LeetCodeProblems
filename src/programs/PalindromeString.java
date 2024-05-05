package programs;

public class PalindromeString {

	public static void main(String[] args) {

		String actualString = "Bob", reverseString = "";

		for (int i = actualString.length() - 1; i >= 0; i--) {
			reverseString = reverseString + actualString.charAt(i);
				
		}
		System.out.println(reverseString);
		if (actualString.equals(reverseString)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("NOT");
		}
	}
}
