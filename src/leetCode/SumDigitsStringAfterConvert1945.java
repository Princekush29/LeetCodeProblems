package leetCode;

public class SumDigitsStringAfterConvert1945 {

	public static void main(String[] args) {
		String s = "leetcode";
		int k = 2;
		System.out.println(getLucky(s, k));
	}

	public static int getLucky(String s, int k) {
		String number = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			number = number + (c - 96);
			System.out.println(number);
		}

		int sum = 0;
		for (int p = 0, l = 0; p < number.length() && l <= k - 1; p++) {
			// char c = number.charAt(p);
			int n = Character.getNumericValue(number.charAt(p));
			sum = sum + n;
			// n = n / 10;

			if (p == number.length() - 1) {
				l++;
				number = Integer.toString(sum);
				p = -1;
				if (l <= k - 1)
					sum = 0;
			}
		}
		return sum;
	}
}