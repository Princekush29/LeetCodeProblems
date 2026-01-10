package programs.String;

public class ReverseTheNumberInTheString {

	public static void main(String[] args) {
		method1();
		method2();
	}

	public static void method1() {
		String str = "Java 2000 is 2025";//Java 0002 is 5202
		String newStr = "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 48 && c <= 57) {
				sb.append(c);
			} else if (!sb.isEmpty() && c == ' ') {
				newStr = newStr + sb.reverse();
				sb = sb.delete(0, sb.length());
				newStr = newStr + " ";
			} else {
				newStr = newStr + str.charAt(i);

			}
		}
		System.out.println(newStr + sb.reverse());
	}

	public static void method2() {
		String str = "Java 1992 is 1998";
		String strArray[] = str.split(" ");
		String newStr = "";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strArray.length; i++) {
			char c = strArray[i].charAt(0);
			if (c >= 48 && c <= 58) {
				sb.append(strArray[i]);
				newStr = newStr + sb.reverse() + " ";
				sb.delete(0, sb.length());
			} else {
				newStr = newStr + strArray[i] + " ";
			}
		}
		System.out.println(newStr);
	}
}
