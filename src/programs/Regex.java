package programs;

public class Regex {

	public static void main(String[] args) {

		String s = "123Bangalore456";
		s = s.replaceAll("[a-zA-Z]", "");
		System.out.println(s);

		s = s.replaceAll("[A-Za-z]", "");
		System.out.println(s);

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

		// Remove all space from String
		String str4 = "Hello   How are    you ?   ";
		str4 = str4.replaceAll(" +", " ");
		System.out.println(str4.trim());
	}
}
