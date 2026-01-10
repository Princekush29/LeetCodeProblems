package programs.String;

public class GreatestOddNumber {
	public static void main(String[] args) {
		String s = "1234567898";
		// o/p - 12345679
		for (int i = s.length() - 1; i >= 0; i--) {
			int a = Character.getNumericValue(s.charAt(i));
			if (a % 2 != 0) {
				System.out.println(s.substring(0, i + 1));
				break;
			}
		}
	}
}