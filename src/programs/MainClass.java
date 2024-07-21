package programs;

class First {
	static void staticMethod() {
		System.out.println("Static Method");
	}
}

public class MainClass {
	public static void main(String[] args) {
		First first = null;

		First.staticMethod();
	}
}