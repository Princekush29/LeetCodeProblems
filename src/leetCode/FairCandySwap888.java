package leetCode;

import java.util.Arrays;

public class FairCandySwap888 {

	public static void main(String[] args) {
		int aliceSizes[] = { 1,1 }, bobSizes[] = { 2,2 };
		System.out.println(fairCandySwap(aliceSizes, bobSizes));
	}

	public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

			int n[] = new int[2];
			int temp = 0, alicesSum = 0, bobSum = 0;
			for (int i = 0; i < aliceSizes.length; i++) {
				alicesSum = alicesSum + aliceSizes[i];
	
			}
			for (int i = 0; i < bobSizes.length; i++) {
				bobSum = bobSum + bobSizes[i];
			}
			int i, j;
			for (i = 0; i < aliceSizes.length; i++) {
				for (j = 0; j < bobSizes.length; j++) {
					temp = aliceSizes[i];
					alicesSum = alicesSum - temp;
					alicesSum = alicesSum + bobSizes[j];
					bobSum = bobSum - bobSizes[j];
					bobSum = bobSum + temp;
	
					if (alicesSum == bobSum) {
						n[0] = aliceSizes[i];
						n[1] = bobSizes[j];
						System.out.println(Arrays.toString(n));
						return n;
						
					}
					alicesSum = alicesSum + temp - bobSizes[j];
					bobSum = bobSum + bobSizes[j] - temp;
				}
			}
			
			return n;
	}
}