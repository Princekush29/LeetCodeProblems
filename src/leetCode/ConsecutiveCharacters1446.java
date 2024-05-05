package leetCode;

public class ConsecutiveCharacters1446 {

	public static void main(String[] args) {
		String s = "abbcccddddeeeeedcba";
		System.out.println(maxPower(s));
	}

	public static int maxPower(String s) {
		int count = 1, newCount = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			char c = s.charAt(i);
			char d = s.charAt(i + 1);
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			}else {
				count=1;
			}
			if (newCount < count) {
				newCount = count;
				
			}
		}
		return newCount;
	}
}