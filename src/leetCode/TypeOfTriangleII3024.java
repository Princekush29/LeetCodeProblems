package leetCode;

public class TypeOfTriangleII3024 {

	public static void main(String[] args) {
		int nums[] = { 3, 4, 5 };
		System.out.println(triangleType(nums));
	}

	public static String triangleType(int[] nums) {
		if (nums[0] == nums[1] && nums[1] == nums[2])
			return "equilateral";
		if (nums[0] == nums[1] || nums[1] == nums[2] || nums[0] == nums[2])
			return "isosceles";
		if ((nums[0] + nums[1]) > nums[2] && (nums[0] + nums[2]) > nums[1] && (nums[1] + nums[2]) > nums[0])
			return "scalene";

		return "none";
	}
}
