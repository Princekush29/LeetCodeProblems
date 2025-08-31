package programs;

public class StaticMethod {

	public static void main(String[] args) {
		System.out.println("Bye");
	}

	static {
		System.out.println("Hello");
	}
}

/* Static Block:
- Runs once when the class is loaded into memory.
- Executes before the main() method.
- Typically used for initializing static variables or performing setup tasks.
*/