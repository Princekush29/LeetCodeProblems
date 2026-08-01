package pq;

public class pq25 {
	public void print(Integer i) {
		System.out.println("Integer");
	}

	public void print(int i) {
		System.out.println("int");
	}

	public void print(long i) {
		System.out.println("long");
	}

	public static void main(String args[]) {
		pq25 test = new pq25();
		test.print(10);
	}
}