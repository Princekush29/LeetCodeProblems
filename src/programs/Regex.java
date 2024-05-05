package programs;

public class Regex {

	public static void main(String[] args) {

		String s = "123Bangalore456";
		s = s.replaceAll("[a-zA-Z]", "");
		System.out.println(s);

	}
}
