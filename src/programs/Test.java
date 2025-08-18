package programs;

public class Test {
	public static void main(String[] args) {
		int arr[] = { 1, 22, 44, 66, 12, 32, 43, 3 };
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < first) {
				second = first;
				first = arr[i];
			} else if (arr[i] < second && arr[i] > first) {
				second = arr[i];
			}
		}
		System.out.println("First max is " + first);
		System.out.println("Second max is " + second);
	}
}