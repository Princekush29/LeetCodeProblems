package leetCode;

public class heckifBinaryStringHasatMostOneSegmentofOnes1784 {

	public static void main(String[] args) {
		String s = "110";
		System.out.println(checkOnesSegment(s));
	}

	public static boolean checkOnesSegment(String s) {

		int flag = 0;
		for (int i = 1; i< s.length(); i++) {
			if (s.charAt(i) == '0') {
				flag = i;
				break;
			}
		}
		System.out.println(flag);
		if (flag > 0) {
			for (int i = flag; i < s.length(); i++) {
				if (s.charAt(i) == '1')
					return false;
			}
		}
		return true;
	}
}
