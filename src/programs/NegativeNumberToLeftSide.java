package programs;

public class NegativeNumberToLeftSide {

	public static void main(String[] args) {

		int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		int arr1[] = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0)
				count++;
		}
		System.out.println("Count is " + count);

		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr1[j] = arr[i];
				j++;
			} else {
				arr1[count] = arr[i];
				count++;
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}