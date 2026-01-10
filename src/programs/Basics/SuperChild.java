package programs.Basics;

public class SuperChild extends SuperParent {

	int a = 10;

	public SuperChild() {
		super();
		System.out.println("I am in child constructor");
	}

	public void printData() {
		System.out.println(a);
		System.out.println(super.a);
	}

	public void getData() {

		System.out.println("I am in child child class");
		super.getData();
	}

	public static void main(String[] args) {

		SuperChild cc = new SuperChild();
		cc.printData();
		cc.getData();

	}
}
