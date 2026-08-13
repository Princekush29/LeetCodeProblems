package pq;

public class DoubleDivisionByZero {

	public static void main(String args[]) {
		double a, b, c;
		a = 3.0 / 0;

		System.out.println(a);

	}
}

/*

Key interview point:
int/long division by zero → ArithmeticException
float/double division by zero → Infinity or NaN.


For floating-point (double) division:

Expression	Result
3.0 / 0	Infinity
-3.0 / 0	-Infinity
0.0 / 0	NaN

*/