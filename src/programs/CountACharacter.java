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
	}
}
