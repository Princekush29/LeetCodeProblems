package programs;

public class StringQuestions {
	public static void main(String args[]) {
		//Q1
		String str = "ONE" + 1 + 2 + "TWO" + "THREE" + 3 + 4 + "FOUR" + "FIVE" + 5;
		System.out.println(str);

		String str10 = 10 + 2 + "TWO" + "THREE" + 3 + 4 + "FOUR" + "FIVE" + 5;
		System.out.println(str10);
		
		//Q2
		String str1 = "Java";
		String str2 = new String("Java");
		String str3 = str2.intern();

		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str2 == str3);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}
}
