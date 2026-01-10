package programs.Basics;

public class StaticCounter {

	static int count = 0; // static variable

	public static void increment() {
		count++; // modifying static variable
	}

	public static void main(String[] args) {
		System.out.println("Initial count: " + count);
		increment();
		System.out.println("After increment: " + count);
		count = 42; // directly modifying
		System.out.println("After manual set: " + count);
	}
}
