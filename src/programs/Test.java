package programs;

public class Test {

	public static void main(String[] args) {
		String s = "Tiger Runs @ The Speed Of 100 km/hour";
		int upper = 0, lower = 0, digit = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c))
				upper++;
			if (Character.isLowerCase(c))
				lower++;
			if (Character.isDigit(c))
				digit++;
		}
	}
}