package pq;

public class ForLoop {
	public static void main(String[] args) {
		int i = 0;
		for (i = 0; i < 5; i++) {
		}
		System.out.println(i);
		System.out.println("++++++++");

		for (int j = 0; j < 5; j++) {
			if (j == 2)
				continue;
			System.out.print(j + " ");
		}
	}
}