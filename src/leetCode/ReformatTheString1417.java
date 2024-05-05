package leetCode;

public class ReformatTheString1417 {

	public static void main(String[] args) {
		String s = "covid201912";
		System.out.println(reformat(s));
	}

	public static String reformat(String s) {
		String newStr1 = "", newStr2 = "", newStr3 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 47 && s.charAt(i) <= 57) {
				newStr1 = newStr1 + s.charAt(i);
			} else {
				newStr2 = newStr2 + s.charAt(i);
			}
		}
		int c = newStr1.length();// 4
		int d = newStr2.length();// 5
		int e = newStr1.length() - newStr2.length();
		if (!(e == 1 || e == 0 || e == -1))
			return "";
		else if (c >= d) {
			for (int i = 0, j = 0; i < c; i++, j++) {
				if (i < c)
					newStr3 = newStr3 + newStr1.charAt(i);
				if (j < d)
					newStr3 = newStr3 + newStr2.charAt(j);
			}
		} else if (c <= d) {
			for (int i = 0, j = 0; i < d; i++, j++) {
				if (i < d)
					newStr3 = newStr3 + newStr2.charAt(j);
				if (j < c)
					newStr3 = newStr3 + newStr1.charAt(i);

			}
		}
		return newStr3;
	}
}