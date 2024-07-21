package leetCode;

public class NumberSegmentsString434 {

	public static void main(String[] args) {
		String s = "Hello, my name is John";
		System.out.println(countSegments(s));
	}

	public static int countSegments(String s) {
		s = s.replaceAll(" +", " ").trim();
		if (s.length() == 0 || s.charAt(0) == ' ')
			return 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((s.length() == 0 || s.charAt(0) == ' ') || s.charAt(i) == ' ')
				count++;
		}
		return count + 1;
	}
}