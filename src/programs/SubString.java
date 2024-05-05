package programs;

public class SubString {

	public static void main(String[] args) {
		String s = "abcd";
		// method1
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}

		// method2
		System.out.println("+++++++++++");
		for (int i = 0; i < s.length(); i++) {
			String newStr = "";
			for (int j = i; j < s.length(); j++) {
				newStr = newStr + s.charAt(j);
				System.out.println(newStr);
			}
		}
	}
}