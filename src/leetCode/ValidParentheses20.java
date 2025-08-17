package leetCode;

import java.util.Stack;

public class ValidParentheses20 {

	public static void main(String[] args) {
		String s = "()[]{}";
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
				continue;
			}
			if (stack.isEmpty())
				return false;

			char topElement;
			switch (c) {
			case ')':
				topElement = stack.pop();
				if (topElement == '[' || topElement == '{')
					return false;
				break;
			case ']':
				topElement = stack.pop();
				if (topElement == '(' || topElement == '{')
					return false;
				break;
			case '}':
				topElement = stack.pop();
				if (topElement == '[' || topElement == '(')
					return false;
				break;
			}
		}
		return stack.isEmpty();
	}
}