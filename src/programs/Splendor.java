package programs;

class Bike {
	static int a = 10;

	void run() {
		System.out.println("running");
	}
}

class Splendor extends Bike {
	static int a = 20;

	void run() {
		System.out.println("running safely with 60km");

	}

	public static void main(String args[]) {
		Bike b = new Splendor(); // upcasting
		b.run();
		System.out.println(b.a);
	}
}
