package programs;

public class PercentageofCharacters {

	public static void main(String[] args) {
		String s = "Tiger Runs @ The Speed Of 100 km/hour";
		int uppercaseCount = 0, lowercaseCount = 0, digitCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch))
				uppercaseCount++;
			else if (Character.isLowerCase(ch))
				lowercaseCount++;
			else if (Character.isDigit(ch))
				digitCount++;
		}
		System.out.println("Size" + s.length());
		float upperPerc = (uppercaseCount * 100) / s.length();
		int lowerPerc = (lowercaseCount * 100) / s.length();
		int digitPerc = (digitCount * 100) / s.length();
		System.out.println(upperPerc);
		System.out.println(lowerPerc);
		System.out.println(digitPerc);
	}

}
