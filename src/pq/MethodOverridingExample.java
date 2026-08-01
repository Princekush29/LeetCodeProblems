package pq;

class One11 {
	public void print() {
		System.out.println("1");
	}
}

class Two22 extends One11 {
	public void print() {
		System.out.println("2");
	}

}

	public class MethodOverridingExample {

	public static void main(String args[]) {
		One11 one11 = new Two22();
		one11.print();
	}
}