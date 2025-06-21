package leetCode;

public class AddStrings415 {

	public static void main(String[] args) {
		String num1 = "4", num2 = "11";
		System.out.println("Output is " + addStrings(num1, num2));
		System.out.println("Output is " + addStrings1(num1, num2));

	}

	// Method 1 - without using any inbuilt functions
	public static String addStrings(String num1, String num2) {
		int len1 = num1.length() - 1;
		int len2 = num2.length() - 1;
		StringBuilder sb = new StringBuilder();
		int carry = 0;
		while (len1 >= 0 || len2 >= 0 || carry != 0) {
			if (len1 >= 0)
				carry = carry + num1.charAt(len1--) - '0';
			if (len2 >= 0)
				carry = carry + num2.charAt(len2--) - '0';
			sb.append(carry % 10);
			carry = carry / 10;
		}
		// System.out.println(sb);
		return sb.reverse().toString();

	}

	// Method 2 - using inbuilt functions
	public static String addStrings1(String a, String b) {
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		System.out.println("Number 1 " + num1);
		System.out.println("Number 2 " + num2);
		int num3 = num1 + num2;
		String number = Integer.toString(num3);
		System.out.println("S is " + number);
		return number;

	}
}