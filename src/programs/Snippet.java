package programs;

public class Snippet {
	public static void main(String args[]) {
		String str = "ONE" + 1 + 2 + "TWO" + "THREE" + 3 + 4 + "FOUR" + "FIVE" + 5;
		String str1 = 1 + 2 + "TWO" + "THREE" + 3 + 4 + "FOUR" + "FIVE" + 5;
		System.out.println(str);
		System.out.println(str1);
	}
}