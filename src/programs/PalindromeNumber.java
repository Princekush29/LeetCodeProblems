package programs;

public class PalindromeNumber {

	public static void main(String[] args) {
		// Method1
		int number = 12821, reverseNumber = 0, reminder;
		int originalNum = number;
		while (number != 0) {
			reminder = number % 10;
			reverseNumber = reverseNumber * 10 + reminder;
			number = number / 10;
		}
		if (originalNum == reverseNumber) {
			System.out.println("Palindrome");
		} else {
			System.out.println("NOT");
		}

		// Method 2
		int num = 12321;
		String s = Integer.toString(num);
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