package pq;

public class ForLoop {
	public static void main(String[] args) {
		int k = 0;
		for (k = 0; k < 5; k++) {
		}
		System.out.println(k);
		System.out.println("++++++++");

		for (int j = 0; j < 5; j++) {
			if (j == 2)
				continue;
			System.out.print(j + " ");
		}
		System.out.println("++++++");

		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
			if (i == 2)
				break;
		}
		System.out.println("++++++");
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length - 2; ++i)
			System.out.print(arr[i] + " ");
	}
}