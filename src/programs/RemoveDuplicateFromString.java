package programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		String str = "aaabbbccdds";
		// Method1
		// String str = "aabbccdd";
		Set<Character> s = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			s.add(str.charAt(i));
		}
		System.out.println(s);
		System.out.println("-------");
		for (Character str1 : s) {
			System.out.print(str1);
		}
		System.out.println("----------");
		Iterator<Character> itr = s.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
		System.out.println("+");
		System.out.println("String "+ str);
		// Method2
		System.out.println("Method 2");
		for (int i = 0; i < str.length(); i++) {
			char newchar = str.charAt(i);
			for (int j = i+1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					String newchar1 = newchar + "";
					str = str.replaceFirst(newchar1, "");
					// break;
					j--;
				} else if (str.charAt(i) != str.charAt(j)) {
					break;
				}
			}
		}
		System.out.println("Output is "+str);
	}
}