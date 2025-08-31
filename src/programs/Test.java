package programs;

public class Test {

	public static void main(String[] args) {
		String s1 = "123Bangalore456";
		String s2 = "123Bangalore456";
		String s3 = "aabbccddee";
		String s4 = "123Bangalore456";
		s1 = s1.replaceAll("[a-zA-Z]", "");
		System.out.println(s1);
		s2 = s2.replaceAll("[^a-zA-Z]", "");
		System.out.println(s2);
		s3=s3.replaceAll("[^aeiouAEIOU]", "");
		System.out.println(s3);
	}
}
