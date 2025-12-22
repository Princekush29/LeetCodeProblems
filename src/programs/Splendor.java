package programs;

class Bike {
	int a = 10;

	void run() {
		System.out.println("running");
	}
}

class Splendor extends Bike {
	int a = 20;

	void run() {
		System.out.println("running safely with 60km");

	}

	public static void main(String args[]) {
		Bike b = new Splendor(); // upcasting 
		//At compile time Java sees b as Bike
		//At runtime Java knows object is Splendor)
		
		b.run(); //Dynamic Binding
		System.out.println(b.a); //Static Binding (Variables are NOT overridden)
	}
}