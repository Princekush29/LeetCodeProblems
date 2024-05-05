package leetCode;

import java.util.Arrays;

public class FairCandySwap888 {

	public static void main(String[] args) {
		int aliceSizes[] = { 2 }, bobSizes[] = { 1, 3 };
		fairCandySwap(aliceSizes, bobSizes);
	}

	public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

		int n[] = new int[2];
		int alicesSum = 0, bobSum = 0;
		for (int i = 0; i < aliceSizes.length; ) {
			int temp = aliceSizes[i];
			aliceSizes[i] = bobSizes[i];
			bobSizes[i] = temp;

			for (int j = 0; j < aliceSizes.length; j++) {
				alicesSum = aliceSizes[j];
			}
			for (int k = 0; k < aliceSizes.length; k++) {
				bobSum = bobSizes[k];
			}
			if (alicesSum == bobSum) {
				n[0] = bobSizes[i];
				n[1] = aliceSizes[i];
			}
		}
		System.out.println(Arrays.toString(n));
		return n;
	}
}