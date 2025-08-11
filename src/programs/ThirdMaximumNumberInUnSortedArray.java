package programs;

public class ThirdMaximumNumberInUnSortedArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 25, 63, 96, 57 };
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = num;
			} else if (num > secondMax && num < firstMax) {
				thirdMax = secondMax;
				secondMax = num;
			} else if (num > thirdMax && num < secondMax) {
				thirdMax = num;
			}
		}
		System.out.println("First max " + firstMax);
		System.out.println("Second max " + secondMax);
		System.out.println("Third max " + thirdMax);

	}

}
