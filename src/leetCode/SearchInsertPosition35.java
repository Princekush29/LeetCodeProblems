package leetCode;

public class SearchInsertPosition35 {

	public static void main(String[] args) {

		int nums[] = { 1, 3 };
		int target = 3;
		System.out.println("123");
		System.out.println(searchInsert(nums, target));
	}

	public static int searchInsert(int[] nums, int target) {
		if (target < nums[0])
			return 0;
		if (nums.length == 1 && nums[0] == target)
			return 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == target)
				return i;
			else if (nums[i] < target && nums[i + 1] > target)
				return i + 1;
			else if (nums[nums.length] == target)
				return nums.length - 1;
		}

		return nums.length;
	}
}