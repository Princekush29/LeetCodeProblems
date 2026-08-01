package pq;

public class pq31_imp {
	public static void main(String args[]) {
		One111 one111 = new Two111();
		one111.print();
	}
}

class One111 {
	public static void print() {
		System.out.println("1");
	}
}

class Two111 extends One111 {
	public static void print() {
		System.out.println("2");
	}
}