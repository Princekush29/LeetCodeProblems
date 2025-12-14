package pq;

class Demo {

	/*- This is not a constructor.
	- It’s a method named Demo, with a void return type.
	- Constructors do not have a return type—not even void.
	So Java treats this as a regular method, not a constructor.
	*/
	void Demo() {
		System.out.println("Demo");
	}
}

public class Constructors1 {

	public static void main(String[] args) {
		Demo demo = new Demo();
	}
}
