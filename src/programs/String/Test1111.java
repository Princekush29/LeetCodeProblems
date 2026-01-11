package programs.String;

public class Test1111 {

	public static void main(String[] args) {
		// i/p - 51230100 o/p1 - 512301
		// * - remove traling zeros o/p2 - 51231 - remove all zeros

		String str = "512301000";
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '0') {
				newStr += str.charAt(i);
			}
		}
		System.out.println(newStr);
		str = str.replaceAll("0", "");
		System.out.println("Str is " + str);

		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != '0') {
				System.out.println(str.substring(0, i + 1));
				break;
			}
		}
	}
}