package programs;

public class StringIdentityHashCode {

	public static void main(String[] args) {
		String a = "Apple";//SCP
		String b = "Apple";//SCP
		String c = new String("Apple");//Heap

		System.out.println(a == b);
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
		System.out.println(a.equals(b));

		System.out.println(a == c);
		System.out.println(a.equals(c));
	}
}