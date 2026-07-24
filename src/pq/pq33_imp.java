package pq;
Programming Question 33 What will be the output of the following Java program?

#interviewquestions #interviewtips

class Parent{
	public void className(){
		System.out.println("Parent");
	}
}
class Child extends Parent{
	void className(){
		System.out.println("Child");
	}
}

public class pq33_imp{

	public static void main(String[] args){
		Parent parent = new Child();
		parent.className();
	}
}

Share your view in Comment section 😍

Output is?
Parent
Child
Runtime error
Compile-time error
