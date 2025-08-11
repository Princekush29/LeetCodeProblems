package programs;

public class ConsecutiveOnes {

	public static void main(String[] args) {

		int arr[] = { 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1 };
		int count = 0, newCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
			} else {
				count = 0;
			}
			if (newCount < count) {
				newCount = count;
			}
		}
		System.out.println(newCount);
	}
}
