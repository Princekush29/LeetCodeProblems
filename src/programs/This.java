package programs;

class This {
	public static void main(String args[]) {
		Student s1 = new Student(111, "ankit", 5000f);
		s1.display();
		Student s2=new Student();		
	}
}

class Student {
	int rollno;
	String name1;
	float fee1;

	Student(int rollno, String name, float fee) {
		System.out.println("I am parameterized constructor");
		this.rollno = rollno;
		name1 = name;
		fee1 = fee;
	}

	Student() {
		System.out.println("I am default constructor");
	}

	void display() {
		System.out.println(rollno + " " + name1 + " " + fee1);
	}
}