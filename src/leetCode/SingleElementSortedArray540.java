package leetCode;

public class SingleElementSortedArray540 {

	public static void main(String[] args) {

		int nums[] = { 1, 1, 2 };
		System.out.println(singleNonDuplicate(nums));

	}

	public static int singleNonDuplicate(int[] nums) {

		if (nums.length == 1)
			return nums[0];
		for (int i = 0; i < nums.length - 1; i++) {
			if (!(nums[i] == nums[i + 1]))
				return nums[i];
			else
				i++;
		}
		return nums[nums.length - 1];
	}
}