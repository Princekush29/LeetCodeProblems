package programs;

public class StringQ {

	public static void main(String[] args) {
		String s1 = "!A@B#C$D";
		// Output string = !D@C#B$A

		String newStr = "", newSymbol = "", newString = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch >= 65 && ch <= 90) {
				newStr = newStr + ch;
			} else {
				newSymbol = newSymbol + ch;
			}
		}
		System.out.println(newStr);
		System.out.println(newSymbol);
		for (int i = newStr.length() - 1, j = 0; i >= 0 && j < newSymbol.length(); i--, j++) {
			newString = newString + newSymbol.charAt(j);
			newString = newString + newStr.charAt(i);
		}
		System.out.println(newString);
	}
}