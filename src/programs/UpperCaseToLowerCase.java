package programs;

public class UpperCaseToLowerCase {

	public static void main(String[] args) {

		// 65 -A
		// 97- a
		String s = "ABCDabcd";
		String s1 = "AABBaabb";
		// Method1
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				char ch = (char) (s.charAt(i) + 32);// 65+32=97
				System.out.print(ch);
			} else if (Character.isLowerCase(s.charAt(i))) {
				char ch = (char) (s.charAt(i) - 32);
				System.out.print(ch);
			}
		}
		System.out.println("----");
		// Method2
		char c1;
		for (int i = 0; i < s1.length(); i++) {
			c1 = s1.charAt(i);
			if (c1 >= 97 && c1 <= 123) {
				c1 = (char) (c1 - 32);
				System.out.print(c1);
			} else if (c1 >= 65 && c1 <= 91) {
				c1 = (char) (c1 + 32);
				System.out.print(c1);
			}
		}
	}
}