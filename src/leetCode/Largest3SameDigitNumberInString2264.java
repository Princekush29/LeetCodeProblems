package leetCode;

public class Largest3SameDigitNumberInString2264 {

	public static void main(String[] args) {
		System.out.println(largestGoodInteger("6000139"));
	}

	public static String largestGoodInteger(String num) {
		String newString, numString = "";
		int number = 0, biggerNum = 0;
		for (int i = 0; i < num.length() - 2; i++) {
			newString = num.substring(i, i + 3);
			// System.out.println(newString);
			if ((newString.charAt(0) == newString.charAt(1)) && (newString.charAt(0) == newString.charAt(2))) {
				number = Integer.parseInt(newString);
				if (biggerNum <= number) {
					biggerNum = number;
					if (biggerNum == 0) {
						numString = Integer.toString(biggerNum) + "00";
					} else {
						numString = Integer.toString(biggerNum);
					}
				}
			}
		}
		return numString;
	}

}