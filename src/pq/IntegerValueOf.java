package pq;

public class IntegerValueOf {
	public static void main(String args[]) {
		int a = 20;
		Integer i = Integer.valueOf(a);// This converts the primitive int into an Integer object.
		Integer j = a; // Autoboxing

		System.out.println(a + " " + i + " " + j);

		String s = "100";
		Integer k = Integer.valueOf(s); // ✓
		// Integer p = s; // ❌ Compilation Error

		System.out.println(s + " " + k);

	}
}
/*
 * Integer.valueOf(a); - Its purpose is to convert a primitive value or a
 * numeric string into an Integer object.
 * 
 */