package programs;

public class StaticInstanceVariable {

	static int a = 10;
	int b = 20;

	public static void main(String[] args) {

		StaticInstanceVariable a1 = new StaticInstanceVariable();
		StaticInstanceVariable a2 = new StaticInstanceVariable();

		System.out.println("Value of static variable 'a' from a1 object: " + a1.a++);
		System.out.println("Value of instance variable 'b' from a1 object: " + a1.b++);
		System.out.println("Value of static variable 'a' from a2 object: " + a2.a++);
		System.out.println("Value of instance variable 'b' from a2 object: " + a2.b++);
	}
}