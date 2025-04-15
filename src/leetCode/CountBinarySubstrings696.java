package leetCode;

public class CountBinarySubstrings696 {

	public static void main(String[] args) {

		String s = "00110011";
		System.out.println(countBinarySubstrings(s));
	}

	public static int countBinarySubstrings(String s) {

		int count = 0;
		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 2; j <= s.length(); j++, j++) {
				String subString = s.substring(i, j);
				System.out.println(subString);
				int count0 = 0, count1 = 0;
				for (int k = 0; k < subString.length(); k++) {
					if (subString.charAt(0) == '0') {
						if (subString.charAt(k) == '0')
							count0++;
						if (subString.charAt(k) != '0') {
							String p = subString.substring(k);
							if (p.contains("0"))
								break;
							count1 = subString.length() - k;
							break;
						}
					} else if (subString.charAt(0) == '1') {
						if (subString.charAt(k) == '1')
							count1++;
						if (subString.charAt(k) != '1') {
							String p = subString.substring(k);
							if (p.contains("1"))
								break;
							count0 = subString.length() - k;
							break;
						}
					}
				}

				if (count0 == count1 && count0 > 0 && count1 > 0) {
					count++;
					// System.out.println("Output is " + subString);
				}
			}
		}
		return count;
	}
}