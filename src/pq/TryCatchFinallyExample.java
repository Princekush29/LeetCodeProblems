package pq;

public class TryCatchFinallyExample {
	public static void main(String args[]) {
		try {
			int number = 25 / 5;
			System.out.println(number);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally");
		}
	}
}