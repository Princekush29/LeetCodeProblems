package leetCode;

public class MaximumScoreAfterSplittingString1422 {

	public static void main(String[] args) {

		String s = "00111";
		System.out.println(maxScore(s));
	}

	public static int maxScore(String s) {
		String c = "", d = "";
		int count = 0, newCount = 0, countC = 0, countD = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			countC = 0;
			countD = 0;
			c = s.substring(0, i + 1);
			for (int j = 0; j < c.length(); j++) {
				if (c.charAt(j) == '0')
					countC++;
			}
			d = s.substring(i + 1, s.length());
			for (int k = 0; k < d.length(); k++) {
				if (d.charAt(k) == '1')
					countD++;
			}
			count = countC + countD;
			if (count > newCount)
				newCount = count;
			count = 0;
		}
		return newCount;
	}
}