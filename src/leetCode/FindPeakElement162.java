package leetCode;

public class FindPeakElement162 {

	public static void main(String[] args) {
		int nums[] = { 3, 2, 1 };
		System.out.println(findPeakElement(nums));
	}

	public static int findPeakElement(int[] nums) {
		if (nums.length == 1)
			return 0;
		if (nums.length == 2) {
			if (nums[0] > nums[1])
				return 0;
			else
				return 1;
		}
		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1])
				return i;
			if (i == nums.length - 2 && nums[0] > nums[nums.length - 1])
				return 0;
			if (i == nums.length - 2 && nums[0] < nums[nums.length - 1])
				return nums.length - 1;
		}
		return 0;
	}
}
