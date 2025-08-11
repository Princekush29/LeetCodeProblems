package programs;

public class PrintAlternateCharacter {

	public static void main(String[] args) {

		String str = "hello";
		for (int i = 0; i < str.length(); i = i + 2) {
			System.out.println(str.charAt(i));
		}
	}
}
