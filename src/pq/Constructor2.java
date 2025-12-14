package pq;

class DemoHello {
	
	public DemoHello(int i) {
		System.out.println("int");
	}

	public void DemoHello(short s) {
		System.out.println("short");
	}
}

public class Constructor2 {

	public static void main(String[] args) {
		short s = 10;
		DemoHello demo = new DemoHello(s);
	}
}