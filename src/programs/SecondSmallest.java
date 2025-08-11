package programs;

public class SecondSmallest {

	public static void main(String[] args) {
		int arr[] = { -11, -12, -3, -7, -6, -4 };
		firstTwoMin(arr);
	}

	public static void firstTwoMin(int arr[]) {
		int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < firstMin) {
				secondMin = firstMin;
				firstMin = arr[i];
			}

			else if (arr[i] < secondMin && arr[i] > firstMin) {
				secondMin = arr[i];
			}
		}
		System.out.println(firstMin);
		System.out.println(secondMin);
	}
}