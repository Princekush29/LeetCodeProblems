package programs;

class This {
	public static void main(String args[]) {
		Student s3 = new Student();
		s3.display();
		Student s1 = new Student(111, "ankit", 5000f);
	
		Student s2 = new Student();
	}
}

class Student {
	int instanceVariable;
	String name;
	float fee1;

	Student(int parameter, String name, float fee) {
		System.out.println("I am parameterized constructor");
		this.instanceVariable = parameter;
		this.name = name;
		fee1 = fee;
	}

	Student() {
		System.out.println("I am default constructor");
	}

	void display() {
		System.out.println(instanceVariable + " " + name + " " + fee1);
	}
}