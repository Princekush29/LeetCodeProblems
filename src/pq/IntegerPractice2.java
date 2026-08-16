package pq;

public class IntegerPractice2 {
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
		IntegerPractice2 test = new IntegerPractice2();
		test.print(10);
		
		short x = 10;
        x =  x * 5;
        System.out.print(x);
	}
	
}