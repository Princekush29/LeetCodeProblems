package programs;

public class CountACharacter {

	public static void main(String[] args) {
		String str = "Java is java again java again";
		char c = 'a';
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println("---");
		System.out.println(str.length());
		System.out.println(str.replace("a", "").length());
		System.out.println("+++");
		int newCount = str.length() - str.replace("a", "").length();
		System.out.println(newCount);

		String s = "48-73";
		int i;
		for (i = 0; i < s.length() - 1; i++) {
			char c1 = s.charAt(i);
			if (c1 == '-') {
				System.out.println("I is " + i);
				break;
			}
		}
		String c1 = s.substring(0, i);
		String c2 = s.substring(i + 1);
		System.out.println(c1);
		System.out.println(c2);
	}
}
