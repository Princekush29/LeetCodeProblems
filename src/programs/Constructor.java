package programs;

public class Constructor {

	public Constructor() {
		System.out.println("I am Constructor");
	}

	public Constructor(int a) {
		//this();
		System.out.println("I am parametrized Constructor");
	}

	public static void main(String[] args) {
		Constructor obj1 = new Constructor();
		Constructor obj = new Constructor(10);
	}
}
