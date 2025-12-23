package programs;

public class Regex {

	public static void main(String[] args) {

		String s = "123Bangalore456";
		s = s.replaceAll("[a-zA-Z]", "");
		System.out.println("S is " + s);

		String s2 = "123Bangalore456";
		s2 = s2.replaceAll("[A-Za-z]", "");
		System.out.println("S2 is " + s2);

		String s3 = "123Bangalore456";
		s3 = s3.replaceAll("[0-9]", "");
		System.out.println("s3 is " + s3);

		String str = "aabbccddee";
		str = str.replaceAll("[aeiouAEIOU]", "");
		System.out.println(str);

		String str2 = "aabbccddee";
		str2 = str2.replaceAll("[^aeiouAEIOU]", "");
		System.out.println(str2);

		// Remove all space from String
		String str3 = "Hello   How are    you ?   ";
		str3 = str3.replaceAll(" +", "");
		System.out.println(str3);

		// Remove extra space from String
		String str4 = "Hello   How are    you ?   ";
		str4 = str4.replaceAll(" +", " ");
		System.out.println(str4.trim());
	}
}
