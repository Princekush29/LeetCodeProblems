package pq;
Programming Question 25 What will be the output of the following Java program?

#interviewquestions #interviewtips

public class pq25 {
	public void print(Integer i) {
		System.out.println("Integer");
	}

	public void print(int i) {
		System.out.println("int");
	}

	public void print(long i) {
		System.out.println("long");
	}

	public static void main(String args[]) {
		pq25 test = new pq25();
		test.print(10);
	}
}


Share your view in Comment section 😍

Output is?
compiler error
long
Integer
int
