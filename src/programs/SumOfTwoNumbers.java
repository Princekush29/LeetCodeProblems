package programs;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 }; //30,70,50
		int size = arr.length, newSize;
		if (size % 2 == 0) {
			newSize = size / 2;
		} else {
			newSize = size / 2 + 1;
		}
		System.out.println(newSize);
		int arr1[] = new int[newSize];

		System.out.println(size);
		for (int i = 0, j = 0; i < arr.length - 1; i++, j++) {
			int sum = arr[i] + arr[i + 1];
			arr1[j] = sum;
			i++;
		}
		if (size % 2 != 0) {
			arr1[newSize - 1] = arr[size - 1];
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}