package pq;

public class General1 {

	public void print(Integer i) {
		System.out.println("Integer");
	}

	public void print(Long i) {
		System.out.println("Long");
	}

	public void print(Object i) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		General1 test = new General1();
		//test.print(null); // ❌ Compile-time error: ambiguous method call
	}
}
