package programs;

import java.util.HashSet;
import java.util.Set;

public class ConsecutiveCharacter {

	public static void main(String[] args) {

		String str = "geekksforgggeeeeks";
		// O/p = [ee, kk, ggg, eeee]
		System.out.println(consecutiveChar(str));
	}

	public static Set<String> consecutiveChar(String str) {
		// we can use ArrayList also when only common element is not required
		Set<String> al = new HashSet<String>();
		String newStr = "";
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				if (newStr.length() < 2)
					newStr = newStr + str.charAt(i) + str.charAt(i + 1);
				else
					newStr = newStr + str.charAt(i);
			} else {
				if (newStr.length() > 1) {
					al.add(newStr);
					newStr = "";
				}
			}
		}
		return al;
	}
}