package leetCode;

public class NumberOfChangingKeys3019 {

	public static void main(String[] args) {
		String s = "mDVD";
		System.out.println(countKeyChanges(s));
	}

	public static int countKeyChanges(String s) {
		s = s.toLowerCase();
		int count = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			char c = s.charAt(i);
			char d = s.charAt(i + 1);
			if (!(c == d)) {
				count++;
			}
		}
		return count++;
	}
}