package leetCode;

public class LargestOddNumberInString1903 {

	public static void main(String[] args) {
		String num = "7542351161";
		System.out.println("Odd number " + largestOddNumber(num));
	}

	public static String largestOddNumber(String num) {
		if (num.length() == 0)
			return "";
		else {
			String odd = "13579";
			for (int i = num.length() - 1; i >= 0; i--) {
				// if (odd.indexOf(num.charAt(i)) >= 0
				String c = num.charAt(i) + "";
				int a = Integer.parseInt(c);
				if (a % 2 != 0)
					return num.substring(0, i + 1);
			}
		}
		return "";

	}
}
