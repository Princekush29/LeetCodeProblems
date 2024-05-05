package programs;
public class PlusOne {
	public static void main(String[] args) {
		int arr[] = { 1,9,9};
		// System.out.println(plusOne(arr));
		int[] storage = plusOne(arr);

		for (int i = 0; i < storage.length; i++)
			System.out.print(storage[i] + " ");
	}

	public static int[] plusOne(int[] arr) {

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] < 9) {
				arr[i]++;
				return arr;
			}
			arr[i] = 0;
		}
		arr = new int[arr.length + 1];
		arr[0] = 1;
		return arr;
	}
}