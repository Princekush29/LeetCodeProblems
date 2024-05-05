package leetCode;

public class TruncateSentence1816 {

	public static void main(String[] args) {
		String s = "chopper is not a tanuki";
		int k = 5;

		System.out.println(truncateSentence(s, k));
	}

	public static String truncateSentence(String s, int k) {
		// Method1
		int count = 0;
		String newStr = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				count++;
			if (count < k)
				newStr = newStr + s.charAt(i);
		}

		// Method2
		StringBuilder sb = new StringBuilder();
		String arr[] = s.split(" ");
		for (int i = 0; i < k; i++) {
			sb = sb.append(arr[i]);
			if (!(i == k - 1))
				sb = sb.append(" ");
		}

		return sb.toString();
	}
}
