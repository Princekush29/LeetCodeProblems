package programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question_String {

	public static void main(String[] args) {
		method10();
		method2();
		method3();
		method4();
	}

	public static void method10() {
		String s = "abcdef";
		s = s.replaceAll("[aeiouAEIOU]", "");
		System.out.println("Method 10 " + s);
	}

	public static void method2() {
		String str = "elephant";
		// method 10 - not contain vowels - aeiou --> lphnt
		// method 3 - reverse str - tna..
		// method 2 - should not have duplicate alphebets-->lphant - Using map
		// method 2 - should not have duplicate alphebets-->lphant - Using set

		Map<Character, Integer> hm1 = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (hm1.containsKey(str.charAt(i))) {
				hm1.put(str.charAt(i), hm1.get(str.charAt(i)) + 1);
			} else {
				hm1.put(str.charAt(i), 1);
			}
		}

		for (Map.Entry<Character, Integer> hm2 : hm1.entrySet()) {
			if (hm2.getValue() == 1) {
				System.out.print(hm2.getKey());
			}
		}
		System.out.println();
		System.out.println("Using set");
		String str1 = "apple";
		Set<Character> s = new HashSet<Character>();
		for (int i = 0; i < str1.length(); i++) {
			s.add(str1.charAt(i));
		}
		System.out.println(s);
	}

	public static void method3() {
		String str = "elephant";
		String newStr = "";
		System.out.println("------------");
		for (int i = str.length() - 1; i >= 0; i--) {
			newStr = newStr + str.charAt(i);
		}
		System.out.println("Reverse String " + newStr);
		System.out.println("------------");
	}

	public static void method4() {
		String str = "abc";
		String newStr2 = "";

		for (int i = 0; i < str.length(); i++) {
			char c[] = { 'a', 'e', 'i', 'o', 'u' };
			if (c.equals(str.charAt(i)))

			/*
			 * if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
			 * str.charAt(i) == 'o' || str.charAt(i) == 'u')
			 */ {

			} else {
				newStr2 = newStr2 + str.charAt(i);
			}
		}
		System.out.println("Not Contain vowels " + newStr2);

	}
}
