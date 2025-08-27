package programs;

public class Test {

	public static void main(String[] args) {
		String input = "aAbB"; // output - dDeE
		int key = 3;
		// A= 65 & a = 97
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c >= 65 && c <= 90) {
				c = (char) ((c + key - 65) % 26 + 65);
				System.out.print(c);
			} else {
				c = (char) ((c + key - 97) % 26 + 97);
				System.out.print(c);
			}
		}
	}
}