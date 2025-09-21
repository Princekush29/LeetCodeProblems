package pq;

public class General {
	public void print(Integer i) {
		System.out.println("Integer");
	}

	/*
	 * public void print(int i) { System.out.println("int"); }
	 */

	public void print(long i) {
		System.out.println("long");
	}

	public static void main(String args[]) {
		General test = new General();
		test.print(10);
		Integer intObj = 100;
		Long longObj = 100L;

		test.print(intObj); // Autoboxed to Integer → prints "Integer"
		test.print(longObj); // longObj is Long, but no method for Long → widened to long → prints "long
		test.print(null);
	}
}