package leetCode;

public class CountTheNumberOfFairPairs2563 {
	public static void main(String[] args) {
		int nums[] = { 0, 1, 7, 4, 4, 5 };
		int lower = 3, upper = 6;
		System.out.println(countFairPairs(nums, lower, upper));
	}

	public static long countFairPairs(int[] nums, int lower, int upper) {
		long count = 0;
		for (int i = 0, j = i + 1; i < nums.length - 1 && j < nums.length;) {
			if (nums[i] + nums[j] >= lower && nums[i] + nums[j] <= upper)
				{count++;
				System.out.println(i +" "+j);
				}
			j++;
			if (j == nums.length) {
				i++;
				j=i+1;
			}

		}

		return count;
	}

}