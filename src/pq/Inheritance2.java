package pq;

class Four {
	public void print() {
		System.out.println("4444");
	}
}

class Five extends Four {
	public void print() {
		System.out.println("55555");
	}
}

public class Inheritance2 {
	public static void main(String args[]) {
		Four four = new Five();
		four.print();
	}
}