package leetCode;

public class Test2 {

	public static void main(String[] args) {

		String s = "AABBaabb";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 65 && c <= 90) {
				c = (char) (c + 32);
				System.out.print(c);
			} else {
				c = (char) (c - 32);
				System.out.print(c);
			}
		}
	}
}