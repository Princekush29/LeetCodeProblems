package leetCode;

public class LatestTimeReplacingHiddenDigits1736 {

	public static void main(String[] args) {
		String time = "?3:02";
		System.out.println(maximumTime(time));
	}

	public static String maximumTime(String time) {
		String newStr = "";

		int i0 = Character.getNumericValue(time.charAt(0));
		int i1 = Character.getNumericValue(time.charAt(1));

		if (i0 >= 0 && i1 >= 0)
			newStr = newStr + time.charAt(0) + time.charAt(1);
		if (time.charAt(0) == '?' && time.charAt(1) == '?')
			newStr = newStr + "23";
		if (time.charAt(0) == '2' && time.charAt(1) == '?')
			newStr = newStr + "23";
		if (time.charAt(0) == '?' && i1 <= 3 && i1 >= 0)
			newStr = newStr + "2" + time.charAt(1);

		if (time.charAt(0) == '?' && i1 <= 9 && i1 >= 4)
			newStr = newStr + "1" + time.charAt(1);

		if ((i0 == 1 || i0 == 0) && time.charAt(1) == '?')
			newStr = newStr + time.charAt(0) + "9";

		newStr = newStr + ":";

		int i3 = Character.getNumericValue(time.charAt(3));
		int i4 = Character.getNumericValue(time.charAt(4));

		if (i3 >= 0 && i4 >= 0)
			newStr = newStr + time.charAt(3) + time.charAt(4);
		if (time.charAt(3) == '?' && time.charAt(4) == '?')
			newStr = newStr + "59";

		if (time.charAt(3) == '?' && i4 <= 9 && i4 >= 0)
			newStr = newStr + "5" + time.charAt(4);

		if (i3 <= 5 && i3 >= 0 && time.charAt(4) == '?')
			newStr = newStr + time.charAt(3) + "9";

		return newStr;
	}
}