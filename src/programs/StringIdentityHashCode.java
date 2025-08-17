package programs;

public class StringIdentityHashCode {

	public static void main(String[] args) {
		String a = "Apple";
		String b = "Apple";
		String c = new String("Apple");

		System.out.println(a == b);
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
		System.out.println(a.equals(b));

		System.out.println(a == c);
		System.out.println(a.equals(c));
	}
}