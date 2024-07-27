package leetCode;

public class ShortestCompletingWord748 {

	public static void main(String[] args) {
		String licensePlate = "1s3 456";
		String words[] = { "looks", "pest", "stew", "show" };
		System.out.println(shortestCompletingWord(licensePlate, words));
	}

	public static String shortestCompletingWord(String licensePlate, String[] words) {
		String newStr = "";
		licensePlate = licensePlate.toLowerCase().replaceFirst(" ", "").replaceAll("[1234567890]", "");

		sortArray(words);

		for (int i = 0; i < words.length; i++) {
			newStr = licensePlate;
			for (int j = 0; j < words[i].length(); j++) {
				String s = words[i].charAt(j) + "";
				newStr = newStr.replaceFirst(s, "");
			}
			if (newStr.isEmpty())
				return words[i];
		}
		return licensePlate;
	}

	public static String[] sortArray(String[] s) {
		int n = s.length;
		for (int i = 1; i < n; i++) {
			String temp = s[i];

			// Insert s[j] at its correct position
			int j = i - 1;
			while (j >= 0 && temp.length() < s[j].length()) {
				s[j + 1] = s[j];
				j--;
			}
			s[j + 1] = temp;
		}
		return s;
	}
}
