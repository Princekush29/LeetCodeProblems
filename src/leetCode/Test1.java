package leetCode;

public class Test1 {

	public static void main(String[] args) {
		String a = "1010", b = "1010";
		System.out.println("Output is " + addBinary1(a, b));
	}

	public static String addBinary1(String a, String b) {
		int carry = 0;
		String newStr = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			if (a.charAt(i) == '0' && b.charAt(i) == '0') {
				if (carry == 0) {
					newStr = "0" + newStr;
					carry = 0;
				} else {
					newStr = "1" + newStr;
					carry = 0;
				}
			} else if ((a.charAt(i) == '0' && b.charAt(i) == '1') || (a.charAt(i) == '1' && b.charAt(i) == '0')) {
				if (carry == 0) {
					newStr = "1" + newStr;
					carry = 0;
				} else {
					newStr = "0" + newStr;
					carry = 1;
				}
			} else if (a.charAt(i) == '1' && b.charAt(i) == '1') {
				if (carry == 0) {
					newStr = "0" + newStr;
					carry = 1;
				} else {
					newStr = "1" + newStr;
					carry = 1;
				}
			}
		}
		if (carry == 1)
			newStr = "1" + newStr;
		return newStr;
	}
}
