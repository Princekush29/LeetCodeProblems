package leetCode;

public class LongPressedName925 {

	public static void main(String[] args) {

		String name = "pyplrz", typed = "ppyypllr";
		System.out.println("Typed length is " + typed.length());
		System.out.println(isLongPressedName(name, typed));
	}

	public static boolean isLongPressedName(String name, String typed) {
		int i, j;
		if (name.length() > typed.length())
			return false;
		for (i = 0, j = 0; i < name.length() && j < typed.length();) {
			if (name.charAt(i) == typed.charAt(j)) {
				i++;
				j++;
			} else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
				j++;
			} else {
				return false;
			}

		}
		if (i == name.length() && j == typed.length())
			return true;
		if (i != name.length() && j == typed.length())
			return false;
		int p = j - 1;
		for (; p < typed.length(); p++) {
			if (typed.charAt(p) != typed.charAt(j))
				return false;
		}
		if (i == name.length())
			return true;
		return false;
	}
}
