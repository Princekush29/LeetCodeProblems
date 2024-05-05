package programs;

public class FindMissingNumber {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 4, 6, 3, 7, 8 }, n;
		n = arr.length;
		n = ((n + 1) * (n + 2)) / 2;
		for (int i = 0; i < arr.length; i++) {
			n -= arr[i];
		}
		System.out.println(n);
	}
}
