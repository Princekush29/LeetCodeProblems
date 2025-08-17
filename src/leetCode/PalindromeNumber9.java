package leetCode;

public class PalindromeNumber9 {

	public static void main(String[] args) {
		int x = 121;
		System.out.println(isPalindrome(x));
	}

	public static boolean isPalindrome(int x) {
		int newNumber = 0, n = x;
		int r;
		if (x < 0)
			return false;
		while (x != 0) {
			r = x % 10;
			newNumber = newNumber * 10 + r;
			x = x / 10;
		}
		if (newNumber == n)
			return true;
		else
			return false;
	}
}
