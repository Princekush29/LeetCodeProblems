package leetCode;

public class ReverseStringII541 {

	public static void main(String[] args) {
		String s = "abcdefg"; // bacdfeg
		int k = 8;
		System.out.println("11");
		System.out.println(reverseStr(s, k));
	}

	public static String reverseStr(String s, int k) {
		String newStr = "";
		if (s.length() < k) {
			for (int d = s.length() - 1; d >= 0; d--) {
				newStr = newStr + s.charAt(d);
			}
			return newStr;
		}
		int a = 0;
		int b = k;
		for (int i = 0; i < s.length();) {
			int count = 0;
			int z = i + k - 1;
			if (z > s.length())
				z = s.length() - 1;

			if (a < b) {
				for (int j = z; j <= s.length() && count < k && newStr.length() < s.length(); j--) {
					newStr = newStr + s.charAt(j);
					a++;
					i++;
					z--;
					count++;
				}
			} else {
				a = a + k;
				b = b + k;
				int count1 = 0;
				if (a > k) {
					for (int p = i; p < s.length() && count1 < k; p++) {
						newStr = newStr + s.charAt(p);
						a--;
						i++;
						count1++;
					}
				}
				a = a + k;
				b = b + k;
			}
		}
		return newStr;
	}
}