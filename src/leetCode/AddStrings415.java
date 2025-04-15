package leetCode;

public class AddStrings415 {

	public static void main(String[] args) {
		String num1 = "4", num2 = "11";
		System.out.println("Output is " + addStrings(num1, num2));
		System.out.println("Output is " + addStrings1(num1, num2));

	}

	// Method 1 - without using any inbuilt functions
	public static String addStrings(String num1, String num2) {
		int borrow = 0, c, reminder;
		if (num1.length() > num2.length())
			num2 = modifyString(num1, num2);
		else
			num1 = modifyString(num2, num1);

		System.out.println(num1);
		System.out.println(num2);
		StringBuffer sb = new StringBuffer();

		for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--) {

			String s1 = num1.charAt(i) + "";
			String s2 = num2.charAt(j) + "";
			c = Integer.parseInt(s1) + Integer.parseInt(s2) + borrow;
			if (c >= 10) {
				reminder = c % 10;
				borrow = c / 10;
			} else {
				reminder = c;
				borrow = 0;
			}

			if (i == 0 && j == 0 && borrow > 0) {
				sb.append(reminder);
				sb.append(borrow);
			} else {
				sb.append(reminder);
			}
		}
		String s = new String(sb.reverse());
		return s;
	}

	public static String modifyString(String num1, String num2) {
		int len = num1.length() - num2.length();
		System.out.println("Len is " + len);
		for (int i = 0; i < len; i++) {
			num2 = "0" + num2;
		}
		return num2;
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