package programs;

public class TestingOmnicell1 {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int num = 4;
		System.out.println(binarySearch(nums, num));
	}

	public static int binarySearch(int nums[], int num) {
		int len = nums.length;
		int start = 0, end = len - 1;
		while (start < end) {
			if (num < len / 2) {
				end = len / 2;
				len = len/2;
			} else {
				start = len / 2;
				//end = len;
				len = len/2;
			}
		}
		return 0;
	}
}