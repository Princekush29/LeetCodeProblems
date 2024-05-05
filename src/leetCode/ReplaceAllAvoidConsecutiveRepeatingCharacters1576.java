package leetCode;

public class ReplaceAllAvoidConsecutiveRepeatingCharacters1576 {

	public static void main(String[] args) {
		String s = "j?qg??b";
		System.out.println(modifyString(s));
	}

	public static String modifyString(String s) {
		char c = ' ';
		String newStr = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '?' && i == 0) {
				c = (char) (s.charAt(i + 1) - 1);
				System.out.println("C at start " + c);
			} else if (ch == '?') {
				char e = s.charAt(i + 1);
				char f = s.charAt(i - 1);
				for (int k = 97; k >= 97 && k <= 122; k++) {
					char d = ((char) k);
					if (e != d && f != d) {
						c = d;
						break;
					}
				}
			} else if (ch == '?' && i == s.length() - 1) {
				c = (char) (s.charAt(i - 1) + 1);
				System.out.println("C at end " + c);
			}
			if (ch == '?')
				newStr = newStr + c;
			else
				newStr = newStr + ch;
		}
		return s;
	}
}