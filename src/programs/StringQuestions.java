package programs;

public class StringQuestions {
	public static void main(String args[]) {
		// Q1
		String str = "ONE" + 1 + 2 + "TWO" + "THREE" + 3 + 4 + "FOUR" + "FIVE" + 5;
		System.out.println(str);

		String str10 = 10 + 2 + "TWO" + "THREE" + 3 + 4 + "FOUR" + "FIVE" + 5;
		System.out.println(str10);

		// Q2
		String str1 = "Java";
		String str2 = new String("Java");
		String str3 = str2.intern();

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));

		// Q3
		String str5 = null;
		System.out.println(str5 + "hello");
		System.out.println(str5.length());
		
		//Q4
		String s1 = "abc";
		String s2 = s1;
		String s3 = new String("abc");
		String s4 = s1 + "def";

		System.out.println(s1.equals(s2));// - True
		System.out.println(s1.equals(s3)); // - True
		System.out.println(s1.equals(s4));// - False
		System.out.println(s1 == s2);// true
		System.out.println(s2 == s3);// - False
		System.out.println(s1 == s4);// - False
		System.out.println(s1 == s3);// - False

		System.out.println("---");
		String a = "Apple";
		String b = "Apple";
		String c = new String("Apple");
		System.out.println(a == b);
		System.out.println(a.equals(b));

		System.out.println(a == c);
		System.out.println(a.equals(c));
	}
}
