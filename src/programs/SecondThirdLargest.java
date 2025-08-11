package programs;

public class SecondThirdLargest {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 6, 7, 2, 3 };
		firstTwoMax(arr);
	}

	public static void firstTwoMax(int arr[]) {
		int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = arr[i];
			}

			else if (arr[i] > secondMax && arr[i] < firstMax) {
				thirdMax = secondMax;
				secondMax = arr[i];
			} else if (arr[i] > thirdMax && arr[i] < secondMax && arr[i] < firstMax) {
				thirdMax = arr[i];
			}
		}
		System.out.println(firstMax);
		System.out.println(secondMax);
		System.out.println(thirdMax);

	}
}