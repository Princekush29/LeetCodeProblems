package programs;

public class StaticVariable {

	int a = 10; // static variable
	static int b = 10; // class variable

	public void tes() {

	}

	public static void main(String[] args) {
		StaticVariable sv1 = new StaticVariable();
		StaticVariable sv2 = new StaticVariable();

		System.out.println(sv1.a++);
		System.out.println(sv2.a++);
		System.out.println("+++++");
		System.out.println(sv1.b++);
		System.out.println(sv2.b++);

	}
}
