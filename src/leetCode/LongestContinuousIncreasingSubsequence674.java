package leetCode;

public class LongestContinuousIncreasingSubsequence674 {

	public static void main(String[] args) {
		int nums[] = { 1, 3, 5, 4, 7 };
		System.out.println(findLengthOfLCIS(nums));
	}

	public static int findLengthOfLCIS(int[] nums) {
		  int token = -1, count = 1, newCount = 0;
	        for (int i = 0; i < nums.length - 1; i++) {
	            if (nums[i] < nums[i + 1]) {
	                token = 0;
	                count++;
	            } else{
	                token=0;
	                count = 1;
	            }
	            if (count > newCount)
	                newCount = count;
	        }
	        if (token == -1)
	            return newCount + 1;
	        else
	            return newCount;
	}
}