package programs;
import java.util.Stack;

public class Balance1 {

	public static void main(String[] args) {
		String balanceString = "[()]";
		if (verifyBalanceString(balanceString)) {
			System.out.println("Balance");
		} else {
			System.out.println("NOT BALANCE");
		}
	}

	public static boolean verifyBalanceString(String balanceString) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < balanceString.length(); i++) {
			char c = balanceString.charAt(i);
			{
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
		}
		return stack.isEmpty();
	}
}  
