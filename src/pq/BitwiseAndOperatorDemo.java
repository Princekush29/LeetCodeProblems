package pq;

public class BitwiseAndOperatorDemo {
	public static void main(String[] args) {
		boolean var1 = true;
		boolean var2 = false;
		System.out.println(var1 & var2);
	}
}

/*

An important Java distinction:

& → bitwise AND, and with booleans it evaluates both operands
&& → logical AND, uses short-circuit evaluation

Rule: && returns true only when both operands are true.
*/