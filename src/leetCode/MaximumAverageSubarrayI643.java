package leetCode;

public class MaximumAverageSubarrayI643 {

	public static void main(String[] args) {
		int nums[] = { 0, 1, 1, 3, 3 }, k = 4;
		System.out.println(findMaxAverage(nums, k));
	}

	public static double findMaxAverage(int[] nums, int k) {
		int sum = 0, maxSum = 0;
		for (int i = 0; i < k; i++)
			sum = sum + nums[i];

		maxSum = sum;
		for (int i = k; i < nums.length; i++) {
			sum = sum + nums[i] - nums[i - k];
			maxSum = Math.max(maxSum, sum);
		}

		return (double) maxSum / 4;
		/*
		 * if (nums.length == 1 && k == 1) return nums[0]; int count = 0, newCount = 0;
		 * double sum = 0; double avg = 0, finalSum = -10001; for (int i = 0; newCount <
		 * nums.length - k + 1; i++) { if (count < k) { sum = sum + nums[i]; count++; }
		 * else { avg = sum / k; if (finalSum < avg) finalSum = avg; i = i - k;
		 * newCount++; sum = 0; count = 0; } } return finalSum;
		 */
	}
}