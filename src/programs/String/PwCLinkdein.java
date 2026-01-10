package programs.String;

public class PwCLinkdein {
	public static void main(String[] args) {
		String str = "BOY IS GOOD";
		// o/p = BIG
		String newStr = "";
		String arr[] = str.split(" ");
		for (String words : arr) {
			newStr = newStr + words.charAt(0);
		}
		System.out.println(newStr);
	}

}
