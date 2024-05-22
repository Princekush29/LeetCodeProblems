package leetCode;

import java.util.Arrays;

public class GetMaximumInGeneratedArray1646 {

	public static void main(String[] args) {
		int n = 0;
		System.out.println(getMaximumGenerated(n));
	}

	public static int getMaximumGenerated(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 0;
		
		int nums[] = new int[n + 1];
		int max=0;
		nums[0] = 0;
		nums[1] = 1;
		for (int i = 2; i <= n; i++) {
			if (i % 2 == 0) {
				nums[i] = nums[i / 2];
			} else {
				nums[i] = nums[i / 2] + nums[(i / 2) + 1];
			}
			max = Math.max(nums[i], max);
		}
		
		/*
		 * System.out.println(Arrays.toString(nums)); Arrays.sort(nums);
		 */
		return max;
	}
}