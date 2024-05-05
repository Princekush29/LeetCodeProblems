package leetCode;

public class AntOnTheBoundary3028 {

	public static void main(String[] args) {
		int nums[] = { 2, 3, -5 };
	}

	public static int returnToBoundaryCount(int[] nums) {
		int sum = 0, count = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			if (sum == 0) {
				count++;
			}
		}
		return count;
	}
}
