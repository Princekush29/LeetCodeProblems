package leetCode;

public class FindTheDifference389 {
	public static void main(String[] args) {

		String s = "a", t = "aa";
		System.out.println(findTheDifference(s, t));
	}

	public static char findTheDifference(String s, String t) {

		for (int i = 0; i < s.length(); i++) {
			String p = s.charAt(i) + "";
			t = t.replaceFirst(p, "");
		}
		return t.charAt(0);
	}
}
