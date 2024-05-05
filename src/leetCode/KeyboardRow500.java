package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class KeyboardRow500 {

	public static void main(String[] args) {
		String words[] = { "Aasdfghjkl", "Qwertyuiop", "zZxcvbnm" };
		System.out.println(findWords(words));
	}

	public static String[] findWords(String[] words) {
		String s1 = "qwertyuiopQWERTYUIOP";
		String s2 = "asdfghjklASDFGHJKL";
		String s3 = "zxcvbnmZXCVBNM";
		ArrayList<String> list = new ArrayList<String>();
		int m = 0;
		for (int i = 0; i < words.length; i++) {
			String s4 = words[i];
			int k = 0, l = 0, p = 0;
			for (int j = 0; j < s4.length(); j++) {
				char c = s4.charAt(j);
				if (s1.contains(String.valueOf(c))) {
					k++;
				} else if (s2.contains(String.valueOf(c))) {
					l++;
				} else if (s3.contains(String.valueOf(c))) {
					p++;
				}
			}
			if (k == s4.length() || l == s4.length() || p == s4.length()) {
				list.add(s4);
				m++;
			}
		}
		String str[] = new String[list.size()];
		Iterator<String> itr = list.iterator();
		int a = 0;
		while (itr.hasNext()) {

			str[a] = itr.next();
			a++;
		}
		System.out.println(Arrays.toString(str));
		return str;
	}
}