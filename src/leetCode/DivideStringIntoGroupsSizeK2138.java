package leetCode;

public class DivideStringIntoGroupsSizeK2138 {

	public static void main(String[] args) {
		String s = "abcdefghij";
		char fill = 'x';
		int k = 3;
		divideString(s, k, fill);
	}

	public static String[] divideString(String s, int k, char fill) {

		int a = 0, b = k;

		while (s.length() % k != 0) {
			s = s + fill;
		}
		String str[] = new String[s.length() / k];
		for (int i = 0; i < str.length; i++, a = a + k, b = b + k) {
			str[i] = s.substring(a, b);
			System.out.println(str[i]);

		}
		return str;

	}
}
