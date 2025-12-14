package pq;

public class StaticVariable {

	static String name = "Ramesh";

	public StaticVariable() {
		name = "Prabhas";
	}

	public static void main(String[] args) {
		System.out.println("The name is " + name);
	}
}
