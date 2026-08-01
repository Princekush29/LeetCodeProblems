package pq;

public class StringNullPointerExceptionExample1 {

	public static void main(String[] args) {
		String s1 = null;
		System.out.println(s1); // line 2
		System.out.println(s1.toString()); // line 3
	}
}