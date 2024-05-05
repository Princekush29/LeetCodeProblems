package leetCode;

public class MaximumOddBinaryNumber2864 {

	public static void main(String[] args) {
		String s = "010";
		System.out.println(maximumOddBinaryNumber(s));
	}

	public static String maximumOddBinaryNumber(String s) {
		int count = 0;
		String newStr = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '1') {
				count++;
			}
		}
		if (count == 1)
			newStr = "001";
		if (count == 2)
			newStr = "1001";
		return newStr;
	}
}