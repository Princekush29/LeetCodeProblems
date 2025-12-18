package programs;

public class StringQuestions {
	public static void main(String args[]) {
		System.out.println(".equals will check the value");
		System.out.println("== will check the address");
		// below method is used to print
		String z = "hello";
		System.out.println(System.identityHashCode(z));

		// Q1
		String str = "ONE" + 1 + 2 + "TWO" + "THREE" + 3 + 4 + "FOUR" + "FIVE" + 5;
		System.out.println(str);

		String str10 = 10 + 2 + "TWO" + "THREE" + 3 + 4 + "FOUR" + "FIVE" + 5;
		System.out.println(str10);

		// Q2
		System.out.println("----Q2----");
		String str1 = "Java"; // point to String constant pool
		String str2 = new String("Java"); // point to Heap memory
		String str3 = str2.intern(); // point to String constant pool

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));

		// Q3
		System.out.println("----Q3----");
		String s1 = "abc"; // point to String constant pool
		String s2 = s1; // point to String constant pool reference
		String s3 = new String("abc"); // point to heap memory
		String s4 = s1 + "def";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1 == s3);

		// Yes, the intern() method is used to redirect a heap-based string reference to
		// the String Constant Pool (SCP) — but only if an identical string already
		// exists there, or it adds it if not.
		System.out.println("After s3 point to string constant pool");
		// if i want s3 to point to String constant pool
		s3 = new String("abc").intern();
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);

		System.out.println("---");
		String a = "Apple"; // SCP
		String b = "Apple"; // SCP
		String c = new String("Apple"); // Heap memory
		System.out.println(a == b);
		System.out.println(a.equals(b));

		System.out.println(a == c);
		System.out.println(a.equals(c));

		// Q5
		System.out.println("----Q5----");
		String s11 = "abc";
		StringBuffer s22 = new StringBuffer(s11);
		System.out.println(s11.equals(s22));
		System.out.println(s11.equals(s22.toString()));

		/*
		 * Why s1.equals(s2) returns false: - s1 is a String - s2 is a StringBuffer Even
		 * though they contain the same characters ("abc"), they are different types,
		 * and String.equals(Object) checks: - Type compatibility - Character sequence
		 * equality. Since s2 is not a String, the equals method in String returns false
		 * immediately without checking contents.
		 */

		String str11 = "Hello";
		str11 += " World!";
		System.out.println("String 11 is " + str11.length());

		String str22 = "Java";
		str22.concat(" Programming");
		System.out.println("String 22 is " + str22);

		String str111 = "Java";
		String str222 = "Java";
		String str333 = new String("Java");

		System.out.println(str111.equals(str222) && str111.equals(str333));

		// Q4
		System.out.println("----Q4----");
		String str5 = null;
		System.out.println(str5 + "hello");
	}
}
