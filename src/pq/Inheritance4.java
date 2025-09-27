package pq;

public class Inheritance4 {
	public static void main(String args[]) {
		Seven seven = new Eight();
		seven.print();
	}
}

class Seven {
	public static void print() {
		System.out.println("777");
	}
}

class Eight extends Seven {
	public static void print() {
		System.out.println("888");
	}
}