package leetCode;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString1047 {

	public static void main(String[] args) {
		String s = "abbbabaaa";
		System.out.println(removeDuplicates(s));
	}

	public static String removeDuplicates(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if (stack.isEmpty() || stack.peek() != c) {
				stack.push(c);
			} else if (!stack.isEmpty() && c == stack.peek()) {
				stack.pop();
			}
		}

		StringBuilder builder = new StringBuilder();
		for (char c : stack)
			builder.append(c);
		builder.reverse();

		return builder.toString();

	}

	/*
	 * public static String removeDuplicates(String s) { for (int i = 0; i <
	 * s.length() - 1;) { if (s.charAt(i) == s.charAt(i + 1)) { s = s.substring(0,
	 * i) + "" + s.substring(i + 2, s.length()); i = 0; } else { i++; } } return s;
	 * }
	 */
}