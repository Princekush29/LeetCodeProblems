package programs.String;

public class Test1111 {

	public static void main(String[] args) {
		System.out.println(test());
	}

	public static String test() {
		String s = "abcdcbc", newStr = "";
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (!(s.charAt(i) == s.charAt(j)))
				return "Not Palindrome";
		}
		return "Palindrome";
	}
}