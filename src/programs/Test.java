package programs;

public class Test {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 20, 3, 10, 5 };
		int sum = 33, newSum = 0, token = 1;
		for (int i = 0, j = i + 1; j < arr.length; j++) {
			int a = arr[i];
			if (token == 1) {
				newSum = newSum + a;
				newSum = newSum + arr[j];
				token = 2;

			} else {
				newSum = newSum + arr[j];
			}
			if (sum == newSum) {
				System.out.println(i);
				System.out.println(j);
				break;
			}
			if (j == arr.length - 1 || newSum > sum) {
				token = 1;
				i = i + 1;
				j = i;
				newSum = 0;
			}
		}
	}
}
