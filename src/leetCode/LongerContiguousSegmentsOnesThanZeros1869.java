package leetCode;

public class LongerContiguousSegmentsOnesThanZeros1869 {

	public static void main(String[] args) {

		String s = "110100010";
		System.out.println(checkZeroOnes(s));
	}

	public static boolean checkZeroOnes(String s) {

		int count1 = 0, count0 = 0, newCount1 = 0, newCount0 = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				count1++;
				count0 = 0;
			}
			if (s.charAt(i) == '0') {
				count0++;
				count1 = 0;
			}
			if (count1 > newCount1)
				newCount1 = count1;
			if (count0 > newCount0)
				newCount0 = count0;
		}
		return newCount1 > newCount0;
	}
}
