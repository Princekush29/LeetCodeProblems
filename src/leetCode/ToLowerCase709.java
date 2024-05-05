package leetCode;

public class ToLowerCase709 {

	public static void main(String[] args) {

		String s = "Hello";
		System.out.println(toLowerCase(s));
	}

	public static String toLowerCase(String s) {
		/*
		 * s= s.toLowerCase(); return s;
		 */
		String newStr = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 65 && c <= 90) {
				c = (char) (c + 32);
				newStr = newStr + c;
			} else {
				newStr = newStr + c;
			}
		}
		return newStr;
	}

}
