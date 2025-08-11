package programs;

public class Practice1 {

	public static void main(String[] args) {
		int arr[] = {  };
		findMaximum(arr);
	}

	public static void findMaximum(int arr[]) {
		int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstMax) {
				secondMax = firstMax;
				firstMax = arr[i];
			} else if (arr[i] > secondMax && arr[i] < firstMax) {
				secondMax = arr[i];
			}
		}
		if (secondMax == -2147483648)
			secondMax = firstMax;
		System.out.println(firstMax);
		System.out.println(secondMax);
	}
}