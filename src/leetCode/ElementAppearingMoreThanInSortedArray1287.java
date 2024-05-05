package leetCode;

public class ElementAppearingMoreThanInSortedArray1287 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 6, 6, 6, 6, 7, 10 };
		System.out.println(findSpecialInteger(arr));
	}

	public static int findSpecialInteger(int[] arr) {
		if (arr.length == 1)
			return arr[0];
		int count = 0, newCount = 0, max = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
				continue;
			} else
				count = 0;

			if (newCount < count) {
				newCount = count;
				max = arr[i];
			}
		}
		return max;
	}
}
