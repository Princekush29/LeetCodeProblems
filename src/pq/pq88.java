package pq;
Programming Question 88 What will be the output of the following Java program?

#interviewquestions #interviewtips

public class pq88 {
	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}

Share your view in Comment section 😍

Output is?
true true
false false
false true
true false
