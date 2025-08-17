package leetCode;

import java.util.Stack;

public class BackspaceStringCompare844 {

	public static void main(String[] args) {

		String s = "xywrrmp", t = "xywrrmu#p";
		System.out.println(backspaceCompare(s, t));
	}

	public static boolean backspaceCompare(String s, String t) {
		Stack<Character> s1 = new Stack<>();
		Stack<Character> s2 = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '#') {
				if (!(s1.isEmpty())) {
					s1.pop();
				}
			} else {
				s1.push(s.charAt(i));
			}

		}
		for (int j = 0; j < t.length(); j++) {
			if (t.charAt(j) == '#') {
				if (!(s2.isEmpty())) {
					s2.pop();
				}
			} else {
				s2.push(t.charAt(j));
			}

		}
		System.out.println(s1);
		System.out.println(s2);
		return s1.equals(s2);
	}
}