package programs.Basics;

public class FinalMethod {
	public static void main(String[] args) {
		Dog d = new Dog();

		// Calling the inherited final method
		d.sound();

		// Calling through another method
		d.display();
	}
}

//Parent class
class Animal {

	// Final method
	final void sound() {
		System.out.println("Animals make sounds");
	}
}

//Child class
class Dog extends Animal {

	// This would cause a compile-time error
	// void sound() { System.out.println("Dog barks"); }

	void display() {
		// Inherited final method can still be called
		sound();
	}
}
