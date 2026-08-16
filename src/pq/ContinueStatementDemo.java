package pq;

public class ContinueStatementDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("++++++++");
		Integer i;
		for (i = 1; i < 6; i++) {
			if (i > 3)
				continue;
		}
		System.out.println(i);
	}
}
