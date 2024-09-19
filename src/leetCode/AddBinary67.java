package leetCode;

public class AddBinary67 {

	public static void main(String[] args) {
		String a = "1010", b = "1010";
		System.out.println("O " + addBinary(a, b));
		System.out.println("Output is " + addBinary1(a, b));
	}

	public static String addBinary(String a, String b) {

		Long aa = Long.parseLong(a);
		System.out.println("AA is" + aa);
		Long bb = Long.parseLong(b);
		System.out.println("BB is" + bb);
		if (aa == 0 && bb == 0)
			return "0";
		int number1 = binarytoInteger(aa);
		int number2 = binarytoInteger(bb);
		int finalNumber = number1 + number2;
		System.out.println("Final " + finalNumber);
		int remi;
		String s = "";
		while (finalNumber > 0) {
			remi = finalNumber % 2;
			s = Integer.toString(remi) + s;
			finalNumber = finalNumber / 2;

		}
		return s;
	}

	public static int binarytoInteger(Long aa) {
		long reminder = 0;
		int newNumber = 0, i = 0, single = 0;
		while (aa > 0) {
			reminder = aa % 10;
			single = (int) (reminder * Math.pow(2, i));
			newNumber = newNumber + single;
			aa = aa / 10;
			i++;
		}
		return newNumber;
	}

	// Method 2
	public static String addBinary1(String a, String b) {

		int carry = 0;
		String newStr = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			if (a.charAt(i) == '0' && b.charAt(i) == '0') {
				if (carry == 1) {
					newStr = "1" + newStr;
					carry = 0;
				} else {
					newStr = "0" + newStr;
					carry = 0;
				}

			} else if ((a.charAt(i) == '0' && b.charAt(i) == '1') || a.charAt(i) == '1' && b.charAt(i) == '0') {
				if (carry == 1) {
					newStr = "0" + newStr;
					carry = 1;
				} else {
					newStr = "1" + newStr;
					carry = 0;
				}
			} else if (a.charAt(i) == '1' && b.charAt(i) == '1') {
				if (carry == 1) {
					newStr = "1" + newStr;
					carry = 1;
				} else {
					newStr = "0" + newStr;
					carry = 1;
				}
			}
		}
		if (carry == 1)
			newStr = "1" + newStr;
		return newStr;

	}
}