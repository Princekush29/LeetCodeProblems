package pq;

public class StringNullPointerExceptionExample2 {

	public static void main(String[] args) {
		String str = null;
		System.out.println(str.valueOf(10));
	}
}

/*
 * 
 * valueOf() is a static method of the String class:
 * 
 * Java allows a static method to be called using a reference variable. The
 * value of str (null) is not used to invoke the static method.
 * 
 * But there is no NPE, because valueOf() is static.
 * 
 * valueOf() → static method → object/reference is not required length() →
 * instance method → needs an actual String object
 * 
 * A static method can be called using a null reference without causing a
 * NullPointerException, because the reference is not dereferenced.
 * 
 */