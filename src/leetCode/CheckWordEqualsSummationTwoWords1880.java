package leetCode;

public class CheckWordEqualsSummationTwoWords1880 {

	public static void main(String[] args) {

		String firstWord = "aaa", secondWord = "a", targetWord = "aab";
		System.out.println(isSumEqual(firstWord, secondWord, targetWord));
	}

	public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
		int number1 = calculateNumber(firstWord);
		int number2 = calculateNumber(secondWord);
		int number3 = calculateNumber(targetWord);

		return number1 + number2 == number3;

	}

	public static int calculateNumber(String s) {
		int number = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.println(c - 97);
			number = (number * 10) + (c - 97);
			System.out.println(number);
		}
		return number;
	}

}
