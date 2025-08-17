package leetCode;

public class Test1 {

	public static void main(String[] args) {
		String num1 = "4", num2 = "11";
		System.out.println("Output is " + addStrings1(num1, num2));
	}

	// Method 3 - without using any inbuilt functions
	public static String addStrings1(String num1, String num2) {
		StringBuilder sb = new StringBuilder();
		int len1 = num1.length() - 1;
		int len2 = num2.length() - 1;
		int carry = 0;
		while (len1 >= 0 || len2 >= 0 || carry != 0) {
			if (len1 >= 0)
				carry = carry + num1.charAt(len1--) - '0';
			if (len2 >= 0) {
				carry = carry + num2.charAt(len2--) - '0';
			}
			sb.append(carry % 10);
			carry = carry / 10;
		}
		return sb.reverse().toString();
	}
}