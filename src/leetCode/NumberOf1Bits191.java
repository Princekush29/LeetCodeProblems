package leetCode;

public class NumberOf1Bits191 {

	public static void main(String[] args) {
		int n = 00000000000000000000000000001011;

		System.out.println(hammingWeight(n));
	}

	public static int hammingWeight(int n) {
		int count = 0;
		while (n != 0) {
			n = n & (n - 1);
			count++;
		}
		return count;
	}
}
