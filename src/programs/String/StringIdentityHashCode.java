package programs.String;

public class StringIdentityHashCode {

	public static void main(String[] args) {
		String a = "Apple";// SCP
		String b = "Apple";// SCP
		String c = new String("Apple");// Heap

		System.out.println(a == b);

		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
		System.out.println(a.equals(b));

		System.out.println(a == c);
		System.out.println(a.equals(c));
	}
}
/*
 * You typically use identityHashCode when:
 * 
 * Debugging: You want to see if two variables point to the exact same instance
 * in memory.
 * 
 * IdentityHashMap: You are building a data structure where "equality" means
 * "exactly the same object," not just "same value."
 * 
 * Preventing Infinite Recursion: In custom toString() or hashCode()
 * implementations for circular data structures.
 */