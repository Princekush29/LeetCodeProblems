package programs.String;

import java.util.Stack;

public class Balance {

	public static void main(String[] args) {
		String balanceString = "[()]";
		System.out.println(verifyBalanceString(balanceString));
		if (verifyBalanceString(balanceString)) {
			System.out.println("Balance");
		} else {
			System.out.println("Not Balance");
		}
	}

	public static boolean verifyBalanceString(String balanceString) {

		Stack<Character> stack = new Stack<Character>();
		// Using ArrayDeque is faster than using Stack class
//		Deque<Character> stack = new ArrayDeque<Character>();

		for (int i = 0; i < balanceString.length(); i++) {
			char c = balanceString.charAt(i);

			if (c == '{' || c == '[' || c == '(') {
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
			case '}':
				topElement = stack.pop();
				if (topElement == '[' || topElement == '(')
					return false;
				break;
			case ']':
				topElement = stack.pop();
				if (topElement == '(' || topElement == '{')
					return false;
				break;
			}
		}

		return stack.isEmpty();
		// true if and only if this vector has no components,
		// that is, its size is zero; false otherwise.
	}
}
