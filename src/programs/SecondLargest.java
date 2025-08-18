package programs;

public class SecondLargest {

	public static void main(String[] args) {

		int arr[] = { 1, 5, 6, 7, 2, 3 };
		firstTwoMax(arr);
		secondMax(arr);
	}

	public static void firstTwoMax(int arr[]) {
		int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstMax) {
				secondMax = firstMax;
				firstMax = arr[i];
			}

			else if (arr[i] > secondMax && arr[i] < firstMax) {
				secondMax = arr[i];
			}
		}
		System.out.println(firstMax);
		System.out.println(secondMax);
	}

	public static void secondMax(int arr[]) {
		// Method2 - No dulplicate should be there
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[arr.length - 2]);
	}
}