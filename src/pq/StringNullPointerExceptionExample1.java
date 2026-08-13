package pq;

public class StringNullPointerExceptionExample1 {

	public static void main(String[] args) {
		String s1 = null;
		System.out.println(s1); // line 2
		System.out.println(s1.length()); // NullPointerException
		System.out.println(s1.toString()); // NullPointerException
	}
}
/*
This works because println() can accept a null reference and simply prints "null".
length() is an instance method. Java needs an actual String object to call it.
toString() is an instance method, and you're trying to call it on null.

*/