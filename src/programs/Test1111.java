package programs;

import java.util.HashSet;
import java.util.Set;

public class Test1111 {

	public static void main(String[] args) {

		String str = "geekksforgggeeeeks";
		// O/p = [ee, kk, ggg, eeee]
		System.out.println(consecutiveChar(str));
	}

	public static Set<String> consecutiveChar(String str) {
		String newStr = "";
		HashSet<String> al = new HashSet<String>();
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				if (newStr.length() < 2) {
					newStr = newStr + str.charAt(i) + str.charAt(i + 1);
				} else {
					newStr += str.charAt(i);
				}
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
