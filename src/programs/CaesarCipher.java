package programs;

public class CaesarCipher {

	public static void main(String[] args) {
		// Method 1
		String input = "aAbB"; // output - dDeE
		int key = 3;
		// A= 65 & a = 97

		for (int i = 0; i < input.length(); i++) {
			// For Uppercase
			if (Character.isUpperCase(input.charAt(i))) {
				char ch = (char) ((input.charAt(i) + key - 65) % 26 + 65);

				System.out.print(ch);
			} else {
				// ForLowerCase
				char ch = (char) ((input.charAt(i) + key - 97) % 26 + 97);
				System.out.print(ch);
			}
		}
	}
}