package leetCode;

public class DeleteCharactersToMakeFancyString1957 {

	public static void main(String[] args) {

		String s = "leeetcodeee";
		System.out.println(makeFancyString(s));
	}

	public static String makeFancyString(String s) {
		int count = 0;
		String newStr = "";
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
				if (count <= 1) {
					newStr = newStr + s.charAt(i);
				}
			} else {
				newStr = newStr + s.charAt(i);
				count = 0;
				
			}
		}
		return newStr+ s.charAt(s.length() - 1);
	}
}
