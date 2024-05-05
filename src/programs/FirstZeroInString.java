package programs;

public class FirstZeroInString {

	public static void main(String[] args) {

		String s = "1500840023", newStr = "", newStr1 = "";
		// o/p - 0000158423

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '0') {
				newStr = newStr + c;
			} else {
				newStr1 = newStr1 + c;
			}
		}
		System.out.println(newStr + newStr1);
	}
}