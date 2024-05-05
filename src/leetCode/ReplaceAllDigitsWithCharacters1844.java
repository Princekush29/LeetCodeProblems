package leetCode;

public class ReplaceAllDigitsWithCharacters1844 {

	public static void main(String[] args) {
		String s = "a1c1e1"; // abbdcfdhe
		System.out.println(replaceDigits(s));
	}

	public static String replaceDigits(String s) {
		StringBuilder sb = new StringBuilder();
		String newStr = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) > 47 && s.charAt(i) < 58) {
				char c = s.charAt(i - 1);
				int number = Character.getNumericValue(s.charAt(i));
				char d = (char) (c + number);
				// newStr = newStr + d;
				sb.append(d);

			} else {
				// newStr = newStr + s.charAt(i);
				sb.append(s.charAt(i));
			}
		}
		//return newStr;
		return sb.toString();
	}
}
