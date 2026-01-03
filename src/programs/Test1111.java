package programs;

public class Test1111 {

	public static void main(String[] args) {
		String input = "aAbB"; // output - dDeE
		int key = 3;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (c >= 65 && c <= 90) {
				c = (char) ((c + key) % 65 + 65);
				System.out.println(c);
			} else {
				c = (char) ((c + key) % 97 + 97);
				System.out.println(c);
			}
		}
	}
}
