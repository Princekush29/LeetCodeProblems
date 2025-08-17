package leetCode;

import java.util.Arrays;

public class DefuseTheBomb1652 {

	public static void main(String[] args) {
		int code[] = { 5, 7, 1, 4 }, k = 3;
		System.out.println(decrypt(code, k));
	}

	public static int[] decrypt(int[] code, int k) {
		int nums[] = new int[code.length];
		for (int i = 0, p = 0; i < code.length; i++) {
			int sum = 0;
			if (k > 0) {
				for (int j = i + 1, w = 1; w <= k; j++) {
					if (!(j == code.length)) {
						sum = sum + code[j];
						w++;

					} else {
						j = 0;
						sum = sum + code[j];
						w++;
					}
				}
			} else {
				int y = k;
				for (int j = i - 1; y < 0; j--) {
					if (!(j < 0)) {
						sum = sum + code[j];
						y++;
					} else {
						j = code.length - 1;
						sum = sum + code[j];
						y++;
					}
				}
			}
			nums[p] = sum;
			p++;

		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}
}
