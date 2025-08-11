package programs;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		String s = "Hello how are you?";
		String newStr = "";
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (!(c == ' ')) {
				newStr = newStr + s.charAt(i);
			}
		}
		System.out.println(newStr);
		String s1=s.replaceAll(" +", "");
		System.out.println(s1);
	}
}
