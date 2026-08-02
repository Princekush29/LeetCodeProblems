package pq;

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

public class Inheritance3 {
	public static void main(String args[]) {
		Seven seven = new Eight();
		seven.print();
	}
}